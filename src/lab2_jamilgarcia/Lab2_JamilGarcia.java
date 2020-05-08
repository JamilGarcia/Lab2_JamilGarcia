package lab2_jamilgarcia;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2_JamilGarcia {
    
    static Scanner jg = new Scanner(System.in);

    public static void main(String[] args) {
        
        ArrayList <Casa> Lista; 
        ArrayList <Casa> EnCons; 
        ArrayList <Casa> ConsEs; 
        ArrayList <Casa> Demo; 
        char resp = 's';
        boolean login = false;
        while (resp == 's'){
            System.out.println(""
                    + "Menu: \n"
                    + "1. Resgitro de Casas \n"
                    + "2. Manejo de Estados \n"
                    + "3. Log In \n"
                    + "0. Salir \n"
                    + "Ingrese una opcion: \n" );
            int opcion = jg.nextInt(); 
            switch (opcion) {
                case 1:
                    System.out.println("Registro de Casas");
                    if (login == true){
                        System.out.println(""
                                + "1. Crear Casa \n"
                                + "2. Listar Casa \n"
                                + "3. Modificar Casa \n"
                                + "4. Borrar Casa \n"
                                + "Ingrese una opcion: ");
                        int opcionA = jg.nextInt();
                        switch (opcionA) {
                            case 1:
                                System.out.println("Crear Casa: ");
                                break;
                            case 2:
                                System.out.println("Listar Casa: ");
                                break;
                            case 3:
                                System.out.println("Modificar Casa: ");
                                break;
                            case 4:
                                System.out.println("Borrar Casa: ");
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida!!!");;
                        }
                    } else {
                        System.out.println("Ingrese al login primero");
                    }
                    break;
                case 2:
                    System.out.println("Manejo de Estasdos");
                    if (login == true){
                        
                    }  else {
                        System.out.println("Ingrese al login primero");
                    }
                    break;
                case 3:
                    System.out.println("Log In");
                    System.out.println("Ingrese el usuario: ");
                    String usua = jg.next();
                    while (!"leobanegas".equals(usua)){
                        System.out.println("Error!! usuario incorrecto!! Ingreselo de nuevo: ");
                        usua = jg.next();
                    }
                    System.out.println("Ingrese contraseña: ");
                    String pass = jg.next();
                    while (!"99".equals(pass)){
                        System.out.println("Error!! Contraseña incorrecta!! Ingreselo de nuevo: ");
                        pass = jg.next();
                    }
                    break;
                case 0:
                    System.out.println("Gracias por utilizar el programa <3");
                    break;
                default:
                    System.out.println("Ingrese un valor valido!!");
            }
        }
    }
    
}
