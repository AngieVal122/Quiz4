import java.time.LocalDate;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date day = new Date();
        System.out.printf("Fecha Actual: %td/%tm/%tY %n", day, day, day);

        LocalDate fechaNacimientoAngie = LocalDate.of(2012, 7, 9);
        Estudiante Angie = new Estudiante("Angie", fechaNacimientoAngie);
        Angie.setNotaMateria1(3.6);
        Angie.setNotaMateria2(4.0);
        Angie.setNotaMateria3(3.8);

        System.out.println("Nombre: " + Angie.getNombre() + "\n" + "Fecha de nacimiento: " + Angie.getFechaNacimiento());
        System.out.println("Nota 1: " + Angie.getNotaMateria1() + "\n" + "Nota 2: " + Angie.getNotaMateria2() + "\n" + "Nota 3: " + Angie.getNotaMateria3() );
        System.out.println("Promedio: " + Angie.getPromedio());
        System.out.println("Tiene " + Angie.getEdad() + " años. \n" );

        LocalDate fechaNacimientoSebastian = LocalDate.of(2008, 8, 25);
        Estudiante Sebastian = new Estudiante("Sebastian", fechaNacimientoSebastian);
        Sebastian.setNotaMateria1(4.8);
        Sebastian.setNotaMateria2(4.2);
        Sebastian.setNotaMateria3(3.3);

        System.out.println("Nombre: " + Sebastian.getNombre() + "\n" + "Fecha de nacimiento: " + Sebastian.getFechaNacimiento());
        System.out.println("Nota 1: " + Sebastian.getNotaMateria1() + "\n" + "Nota 2: " + Sebastian.getNotaMateria2() + "\n" + "Nota 3: " + Sebastian.getNotaMateria3() );
        System.out.println("Promedio: " + Sebastian.getPromedio());
        System.out.println("Tiene " + Sebastian.getEdad() + " años.");
    }
}
