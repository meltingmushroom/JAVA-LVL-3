package LVL3;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static class Alumno {
        private final String nombre;
        private final String apellido;
        private final LocalDate fechaDeNacimiento;
        public Alumno(String nombre, String apellido, LocalDate string) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaDeNacimiento = string;
        }
        public String getFullName() {
            return apellido + " " + nombre + " ";
        }
        public int getAge() {
            return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
        }
    }

    public static void main(String[] args) {

        List<Alumno> alumnos = List.of(
                new Alumno("Homero", "Simpson", LocalDate.parse("1970-09-03")),
                new Alumno("Lisa", "Simpson", LocalDate.parse("1994-05-13")),
                new Alumno("Bart", "Simpson", LocalDate.parse("1998-06-11")),
                new Alumno("Marge", "Simpson", LocalDate.parse("1969-10-17")),
                new Alumno("Maggie", "Simpson", LocalDate.parse("2002-11-03"))
        );

        Map<String, Integer> alumnosMap = alumnos.stream()
                .collect(Collectors
                        .toMap(Alumno::getFullName, Alumno::getAge));

        System.out.println(alumnosMap);
    }
}
