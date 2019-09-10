package scholar;

import java.util.Scanner;

public class Scholar {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Jose Gabriel";
        empleado1.apellido = " Torrenegra";
        empleado1.fecha_nacimiento = " 7 mayo 2002 ";
        empleado1.CalcEdad();
        System.out.println("el empleado se llama " + empleado1.nombre + empleado1.apellido);
        System.out.println("la fecha de nacimiento es " + empleado1.fecha_nacimiento);
        System.out.println("la edad es" + empleado1.CalcEdad () );
        
        Scanner lectura=new Scanner (System.in);
        int edad, año_nacimiento, año_actual;
        System.out.println("ingrese el año de nacimiento de la persona");
        año_nacimiento=lectura.nextInt();
        System.out.println("ingrese el año actual");
        año_actual=lectura.nextInt();
        edad=año_actual-año_nacimiento;
        System.out.println("la edad del empleado es " + edad );
        

        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = " Jose Gabreil ";
        estudiante1.apellido = " torrenegra ";
        estudiante1.genero = " Masculino ";
        System.out.println("el Estudiante se llama " + estudiante1.nombre + estudiante1.apellido);
        System.out.println(" el Estudiante es " + estudiante1.genero);
        //System.out.println("el Estudiante se llama " + estudiante1.nombre + estudiante1.apellido); 
    }              //System.out.println(" el Estudiante es " + estudiante1.genero)

}

