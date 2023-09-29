import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date fechaNacAngie = new Date(2012, 05, 14);
        Estudiante angie = new Estudiante("Angie", fechaNacAngie);

        System.out.println(angie.getPromedio());
        System.out.println(angie.getEdad());

    }
}
