package scholar;

public class Scholar {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Jose Gabriel";
        empleado1.apellido = " Torrenegra";
        empleado1.fecha_nacimiento = " 7 mayo 2002 ";
        empleado1.correo_electronico = "gpernett33@gmail.com";
        empleado1.direccion = "calle 77 con carrera 9";
        empleado1.genero = " Masculino ";
        empleado1.identificacion = "100103045090";
        empleado1.nacionalida = "colomnbia";
        empleado1.profecion = "ing. sistema";
        empleado1.telefono = "3043168857";
        empleado1.tipo_sangre = "O+";
        empleado1.CalcEdad();
        System.out.println("el empleado se llama " + empleado1.nombre + empleado1.apellido);
        System.out.println("la fecha de nacimiento es " + empleado1.fecha_nacimiento);
        System.out.println("el correo electronico es " + empleado1.correo_electronico);
        System.out.println("la direccion es " + empleado1.direccion);
        System.out.println("genero" + empleado1.genero);
        System.out.println("la identificacion es " + empleado1.identificacion);
        System.out.println("su nacionalidad es " + empleado1.nacionalida);
        System.out.println("su profecion es " + empleado1.profecion);
        System.out.println("su telefono es " + empleado1.telefono);
        System.out.println("el tipo de sangre " + empleado1.tipo_sangre);
        System.out.println("la edad es" + empleado1.CalcEdad () );

        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = " Jose Gabreil ";
        estudiante1.apellido = " torrenegra ";
        estudiante1.genero = " Masculino ";
        System.out.println("el Estudiante se llama " + estudiante1.nombre + estudiante1.apellido);
        System.out.println(" el Estudiante es " + estudiante1.genero);
        //System.out.println("el Estudiante se llama " + estudiante1.nombre + estudiante1.apellido); 
    }              //System.out.println(" el Estudiante es " + estudiante1.genero)

}
