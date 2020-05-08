package lab2_jamilgarcia;

import java.util.Scanner;
import java.util.ArrayList;
import javax.crypto.Cipher;

public class Lab2_JamilGarcia {

    static Scanner jg = new Scanner(System.in);
    static ArrayList<Casa> Lista = new ArrayList();
    static ArrayList<Casa> EnCons = new ArrayList();
    static ArrayList<Casa> ConsEs = new ArrayList();
    static ArrayList<Casa> Demo = new ArrayList();

    public static void main(String[] args) {

        ArrayList<Casa> Lista = new ArrayList();
        ArrayList<Casa> EnCons = new ArrayList();
        ArrayList<Casa> ConsEs = new ArrayList();
        ArrayList<Casa> Demo = new ArrayList();
        char resp = 's';
        boolean login = false;
        while (resp == 's') {
            System.out.println("\n"
                    + "Menu: \n"
                    + "1. Resgitro de Casas \n"
                    + "2. Manejo de Estados \n"
                    + "3. Log In \n"
                    + "0. Salir \n"
                    + "Ingrese una opcion: \n");
            int opcion = jg.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Registro de Casas");
                    if (login == true) {
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
                                System.out.println("Casas Listas: \n");
                                ImprimirArray(Lista);
                                System.out.println("Casas En Construccion: \n");
                                ImprimirArray(EnCons);
                                System.out.println("Casas En Espera de Construccion: \n");
                                ImprimirArray(ConsEs);
                                System.out.println("Casas En Espera de Demolicion: \n");
                                ImprimirArray(Demo);
                                break;
                            case 3:
                                System.out.println("Modificar Casa: ");
                                System.out.println("Ingrese El Estado de la casa que desea modificar: \n"
                                        + "1. Lista \n"
                                        + "2. En Construccion \n"
                                        + "3. Construccion en Espera \n"
                                        + "4. Espera de Demolicion \n");
                                int opcionB = jg.nextInt();
                                switch (opcionB) {
                                    case 1:
                                        ImprimirArray(Lista);
                                        System.out.println("Ingrese la casa que quiera modificar: ");
                                        int opcionBa = jg.nextInt();
                                        ImprimirOpciones(1, opcionBa);
                                        break;
                                    case 2:
                                        ImprimirArray(EnCons);
                                        System.out.println("Ingrese la casa que quiera modificar: ");
                                        opcionBa = jg.nextInt();
                                        ImprimirOpciones(2, opcionBa);
                                        break;
                                    case 3:
                                        ImprimirArray(ConsEs);
                                        System.out.println("Ingrese la casa que quiera modificar: ");
                                        opcionBa = jg.nextInt();
                                        ImprimirOpciones(3, opcionBa);
                                        break;
                                    case 4:
                                        ImprimirArray(Demo);
                                        System.out.println("Ingrese la casa que quiera modificar: ");
                                        opcionBa = jg.nextInt();
                                        ImprimirOpciones(4, opcionBa);
                                        break;
                                    default:
                                        System.out.println("Ingrese una opcion correcta!!");
                                }
                                break;
                            case 4:
                                System.out.println("Borrar Casa: ");
                                System.out.println("Ingrese El Estado de la casa que desea modificar: \n"
                                        + "1. Lista \n"
                                        + "2. En Construccion \n"
                                        + "3. Construccion en Espera \n"
                                        + "4. Espera de Demolicion \n");
                                opcionB = jg.nextInt();
                                switch (opcionB) {
                                    case 1:
                                        ImprimirArray(Lista);
                                        System.out.println("Ingrese la casa a eliminar: ");
                                        int casaB = jg.nextInt();
                                        Lista.remove(casaB);
                                        System.out.println("Borrada con exito!");
                                        break;
                                    case 2:
                                        ImprimirArray(EnCons); 
                                        System.out.println("Ingrese la casa a eliminar: ");
                                        casaB = jg.nextInt();
                                        EnCons.remove(casaB);
                                        System.out.println("Borrada con exito!");
                                        break;
                                    case 3:
                                        ImprimirArray(ConsEs);
                                        System.out.println("Ingrese la casa a eliminar: ");
                                        casaB = jg.nextInt();
                                        ConsEs.remove(casaB);
                                        System.out.println("Borrada con exito!");
                                        break;
                                    case 4:
                                        ImprimirArray(Demo);
                                        System.out.println("Ingrese la casa a eliminar: ");
                                        casaB = jg.nextInt();
                                        Demo.remove(casaB);
                                        System.out.println("Borrada con exito!");
                                        break;
                                    default:
                                        System.out.println("Ingrese un valor Valido!!");
                                }
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida!!!");
                                ;
                        }
                    } else {
                        System.out.println("Ingrese al login primero");
                    }
                    break;
                case 2:
                    System.out.println("Manejo de Estasdos");
                    if (login == true) {
                        System.out.println("Ingrese el estado que desea manejar: "
                                + "1. Lista \n"
                                + "2. En Construccion \n"
                                + "3. Construccion en Espera \n" 
                                + "4. Espera de Demolicion");
                        int opcionC = jg.nextInt();
                        switch (opcionC) {
                            case 1:
                                ImprimirArray(Lista);
                                System.out.println("Ingrese una casa: ");
                                int opcionCa = jg.nextInt();
                                System.out.println("Desea cambiar el estado de esta casa de Lista a EN ESPERA DE DEMOLICION? \n"
                                        + "1. SI \n"
                                        + "2. NO\n");
                                int opcionCaA= jg.nextInt();
                                if (opcionCaA == 1){
                                    if(Demo.size() < 3 ){
                                        Demo.add(new Casa());
                                        Demo.set(Demo.size(), Lista.get(opcionCa));
                                        Lista.remove(opcionCa);
                                        System.out.println("Cambio Exitoso");
                                    } else {
                                        System.out.println("La lista de Demolicion está llena, no se cambió nada");
                                    }
                                } else{
                                    System.out.println("Regresando al menu");
                                }
                                break;
                            case 2:
                                ImprimirArray(EnCons);
                                System.out.println("Ingrese una casa: ");
                                opcionCa = jg.nextInt();
                                System.out.println("A que estado desea cambiar la casa: \n"
                                        + "1. Lista \n"
                                        + "2. Espera \n");
                                int opcionCaB = jg.nextInt();
                                switch (opcionCaB) {
                                    case 1:
                                        Lista.add(new Casa());
                                        Lista.set(Lista.size(), EnCons.get(opcionCa));
                                        EnCons.remove(opcionCa);
                                        System.out.println("Cambio Exitoso");
                                        break;
                                    case 2:
                                        ConsEs.add(new Casa());
                                        ConsEs.set(ConsEs.size(), EnCons.get(opcionCa));
                                        EnCons.remove(opcionCa);
                                        System.out.println("Cambio Exitoso");
                                        break;
                                    
                                    default:
                                        System.out.println("Ingrese una opcion valida!!");
                                }
                                break;
                            case 3:
                                ImprimirArray(ConsEs);
                                System.out.println("Ingrese una casa: ");
                                opcionCa = jg.nextInt();
                                System.out.println("Desea cambiar el estado de esta casa de CONSTRUCCION EN ESPERA a EN CONSTRUCCION? \n"
                                        + "1. SI \n"
                                        + "2. NO\n");
                                opcionCaA = jg.nextInt();
                                if (opcionCaA == 1){
                                    if(ConsEs.size() < 5 ){
                                        EnCons.add(new Casa());
                                        EnCons.set(ConsEs.size(), ConsEs.get(opcionCa));
                                        ConsEs.remove(opcionCa);
                                        System.out.println("Cambio Exitoso");
                                    } else {
                                        System.out.println("La lista de Construccion está llena, no se cambió nada");
                                    }
                                } else{
                                    System.out.println("Regresando al menu");
                                }
                                break;
                            case 4:
                                ImprimirArray(Demo);
                                System.out.println("Ingrese una casa: ");
                                opcionCa = jg.nextInt();
                                System.out.println("Desea Demoler esta casa? \n"
                                        + "1. SI \n"
                                        + "2. NO\n");
                                opcionCaA = jg.nextInt();
                                if(opcionCaA == 1){
                                    Demo.remove(opcionCa); 
                                    System.out.println("Demolida con exito");
                                } else {
                                    System.out.println("Regresando al menu");
                                }
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                        }
                    } else {
                        System.out.println("Ingrese al login primero");
                    }
                    break;
                case 3:
                    if (login == false) {
                        System.out.println("Log In");
                        System.out.println("Ingrese el usuario: ");
                        String usua = jg.next();
                        while (!"leobanegas".equals(usua)) {
                            System.out.println("Error!! usuario incorrecto!! Ingreselo de nuevo: ");
                            usua = jg.next();
                        }
                        System.out.println("Ingrese contraseña: ");
                        String pass = jg.next();
                        while (!"99".equals(pass)) {
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

    public static void ImprimirArray(ArrayList<Casa> c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println("----------------------------------------------");
            System.out.println("1. " + c.get(i).toString());
        }
    }

    public static void ImprimirOpciones(int l, int c) {
        System.out.println("Ingrese lo que desea modificar: "
                + "1. Numero de Casa: \n"
                + "2. Numero de Bloque: \n"
                + "3. Color: \n"
                + "4. Ancho: \n"
                + "5. Largo: \n"
                + "6. Fue Comprada o No?: \n"
                + "7. Numero de Pisos: \n"
                + "8. Numero de Baños: \n"
                + "9. Numero de Cuartos: \n"
                + "10. Nombre del dueño: \n"
                + "11. Nombre del ingeniero: \n"
                + "");
        int opcionEx = jg.nextInt();
        switch (opcionEx) {
            case 1:
                System.out.println("Ingrese el nuevo valor: ");
                int IntValor = jg.nextInt();
                switch (l) {
                    case 1:
                        Lista.get(c).setN_casa(IntValor);
                        break;
                    case 2:
                        EnCons.get(c).setN_casa(IntValor);
                        break;
                    case 3:
                        ConsEs.get(c).setN_casa(IntValor);
                        break;
                    case 4:
                        Demo.get(c).setN_casa(IntValor);
                        break;
                }
                break;
            case 2:
                System.out.println("Ingrese el nuevo valor: ");
                IntValor = jg.nextInt();
                switch (l) {
                    case 1:
                        Lista.get(c).setN_bloque(IntValor);
                        break;
                    case 2:
                        EnCons.get(c).setN_bloque(IntValor);
                        break;
                    case 3:
                        ConsEs.get(c).setN_bloque(IntValor);
                        break;
                    case 4:
                        Demo.get(c).setN_bloque(IntValor);
                        break;
                }
                break;
            case 3:
                System.out.println("Ingrese el nuevo valor: ");
                String StrValor = jg.next();
                switch (l) {
                    case 1:
                        Lista.get(c).setColor(StrValor);
                        break;
                    case 2:
                        EnCons.get(c).setColor(StrValor);
                        break;
                    case 3:
                        ConsEs.get(c).setColor(StrValor);
                        break;
                    case 4:
                        Demo.get(c).setColor(StrValor);
                        break;
                }
                break;
            case 4:
                System.out.println("Ingrese el nuevo valor: ");
                IntValor = jg.nextInt();
                switch (l) {
                    case 1:
                        Lista.get(c).setAncho(IntValor);
                        break;
                    case 2:
                        EnCons.get(c).setAncho(IntValor);
                        break;
                    case 3:
                        ConsEs.get(c).setAncho(IntValor);
                        break;
                    case 4:
                        Demo.get(c).setAncho(IntValor);
                        break;
                }
                break;
            case 5:
                System.out.println("Ingrese el nuevo valor: ");
                IntValor = jg.nextInt();
                switch (l) {
                    case 1:
                        Lista.get(c).setLargo(IntValor);
                        break;
                    case 2:
                        EnCons.get(c).setLargo(IntValor);
                        break;
                    case 3:
                        ConsEs.get(c).setLargo(IntValor);
                        break;
                    case 4:
                        Demo.get(c).setLargo(IntValor);
                        break;
                }
                break;
            case 6:
                System.out.println("Ingrese el nuevo valor: ");
                StrValor = jg.next();
                switch (l) {
                    case 1:
                        Lista.get(c).setComprada(StrValor);
                        break;
                    case 2:
                        EnCons.get(c).setComprada(StrValor);
                        break;
                    case 3:
                        ConsEs.get(c).setComprada(StrValor);
                        break;
                    case 4:
                        Demo.get(c).setComprada(StrValor);
                        break;
                }
                break;
            case 7:
                System.out.println("Ingrese el nuevo valor: ");
                IntValor = jg.nextInt();
                switch (l) {
                    case 1:
                        Lista.get(c).setPisos(IntValor);
                        break;
                    case 2:
                        EnCons.get(c).setPisos(IntValor);
                        break;
                    case 3:
                        ConsEs.get(c).setPisos(IntValor);
                        break;
                    case 4:
                        Demo.get(c).setPisos(IntValor);
                        break;
                }
                break;
            case 8:
                System.out.println("Ingrese el nuevo valor: ");
                IntValor = jg.nextInt();
                switch (l) {
                    case 1:
                        Lista.get(c).setBanos(IntValor);
                        break;
                    case 2:
                        EnCons.get(c).setBanos(IntValor);
                        break;
                    case 3:
                        ConsEs.get(c).setBanos(IntValor);
                        break;
                    case 4:
                        Demo.get(c).setBanos(IntValor);
                        break;
                }
                break;
            case 9:
                System.out.println("Ingrese el nuevo valor: ");
                IntValor = jg.nextInt();
                switch (l) {
                    case 1:
                        Lista.get(c).setCuartos(IntValor);
                        break;
                    case 2:
                        EnCons.get(c).setCuartos(IntValor);
                        break;
                    case 3:
                        ConsEs.get(c).setCuartos(IntValor);
                        break;
                    case 4:
                        Demo.get(c).setCuartos(IntValor);
                        break;
                }
                break;
            case 11:
                System.out.println("Ingrese el nuevo valor: ");
                StrValor = jg.next();
                switch (l) {
                    case 1:
                        Lista.get(c).setIngeniero(StrValor);
                        break;
                    case 2:
                        EnCons.get(c).setIngeniero(StrValor);
                        break;
                    case 3:
                        ConsEs.get(c).setIngeniero(StrValor);
                        break;
                    case 4:
                        Demo.get(c).setIngeniero(StrValor);
                        break;
                }
                break;
            case 10:
                System.out.println("Ingrese el nuevo valor: ");
                StrValor = jg.next();
                switch (l) {
                    case 1:
                        Lista.get(c).setDueño(StrValor);
                        break;
                    case 2:
                        EnCons.get(c).setDueño(StrValor);
                        break;
                    case 3:
                        ConsEs.get(c).setDueño(StrValor);
                        break;
                    case 4:
                        Demo.get(c).setDueño(StrValor);
                        break;
                }
                break;
            default:
                System.out.println("Ingrese una opcion correcta!!");
        }

    }

}
