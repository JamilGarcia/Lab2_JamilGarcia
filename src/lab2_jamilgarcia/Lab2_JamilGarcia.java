package lab2_jamilgarcia;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2_JamilGarcia {
    
    static Scanner jg = new Scanner(System.in);

    public static void main(String[] args) {
        
        ArrayList <Casa> Lista = new ArrayList(); 
        ArrayList <Casa> EnCons = new ArrayList(); 
        ArrayList <Casa> ConsEs = new ArrayList(); 
        ArrayList <Casa> Demo = new ArrayList(); 
        char resp = 's';
        boolean login = false;
        while (resp == 's'){
            System.out.println("\n"
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
                                System.out.println("Crear Casa: "
                                        + "Ingrese los datos siguientes: ");
                                        
                                System.out.println("Numero de Casa: ");
                                int n_casa = jg.nextInt();
                                
                                System.out.println("Numero de Bloque: ");
                                int n_bloque = jg.nextInt();
                                
                                System.out.println("Color: ");
                                String color = jg.next();
                                
                                System.out.println("Ancho: ");
                                int ancho = jg.nextInt();
                                
                                System.out.println("Largo: ");
                                int largo = jg.nextInt();
                                
                                String comprada = "NO";
                                String dueno = "NO HA SIDO COMPRADA";
                                System.out.println("Ya fue comprada? \n"
                                        + "1. SI\n"
                                        + "2. NO\n");
                                int opcionAb = jg.nextInt();
                                switch (opcionAb) {
                                    case 1:
                                        comprada = "SI";
                                        System.out.println("Ingrese el nombre del dueño:");
                                        dueno = jg.next();
                                        break;
                                    case 2:
                                        comprada = "NO";
                                        break;
                                    default:
                                        System.out.println("Ingrese opcion Valida!!!");     
                                }
                                
                                System.out.println("Numero de pisos: ");
                                int pisos = jg.nextInt();
                                
                                System.out.println("Numero de baños: ");
                                int banos = jg.nextInt();
                                
                                System.out.println("Numero de cuartos: ");
                                int cuartos = jg.nextInt();
                                
                                System.out.println("Nombre del ingeniero a cargo: ");
                                String ingeniero = jg.nextLine();
                                ingeniero = jg.nextLine();
                                
                                System.out.println("Ingrese la opcion del estado de la casa: \n"
                                        + "1. Lista \n"
                                        + "2. En Construccion \n"
                                        + "3. Construccion en Espera \n"
                                        + "4. En espera de Demolicion \n");
                                int opcionAc = jg.nextInt();
                                switch (opcionAc) {
                                    case 1:
                                        System.out.println("Resgitrando Casa...");
                                        Lista.add(new Casa(n_casa, n_bloque, color, ancho, largo, comprada, pisos, banos, cuartos, dueno, ingeniero));
                                        System.out.println("Casa Regitrada con exito!!");
                                        break;
                                    case 2:
                                        System.out.println("Resgitrando Casa...");
                                        EnCons.add(new Casa(n_casa, n_bloque, color, ancho, largo, comprada, pisos, banos, cuartos, dueno, ingeniero));
                                        System.out.println("Casa Regitrada con exito!!");
                                        break;
                                    case 3:
                                        System.out.println("Resgitrando Casa...");
                                        ConsEs.add(new Casa(n_casa, n_bloque, color, ancho, largo, comprada, pisos, banos, cuartos, dueno, ingeniero));
                                        System.out.println("Casa Regitrada con exito!!");
                                        break;
                                    case 4:
                                        System.out.println("Resgitrando Casa...");
                                        Demo.add(new Casa(n_casa, n_bloque, color, ancho, largo, comprada, pisos, banos, cuartos, dueno, ingeniero));
                                        System.out.println("Casa Regitrada con exito!!");
                                        break;
                                    default:
                                        System.out.println("Ingrese una opcion correcta!!\n"
                                                + "No se ha registrado la casa");
                                }
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
                    if(login == false){
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
                    login = true;
                    } else {
                        System.out.println("Ya estas logueado!!");
                    }
                            
                    break;
                case 0:
                    System.out.println("Gracias por utilizar el programa <3");
                    resp = 'n';
                    break;
                default:
                    System.out.println("Ingrese un valor valido!!");
            }
        }
    }
    
}
