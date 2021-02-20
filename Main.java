package com.chantaldegracia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario, contra, dni, nacion, direccion, fecha, articulo;
        int art, telefono, resp, x;

        System.out.println("Ingresa tus credenciales para ingresar.");
        System.out.println("Usuario: ");
        usuario = sc.nextLine();
        System.out.println("Contraseña: ");
        contra = sc.nextLine();


        System.out.println("¡Bienvenido! ¿Qué deseas realizar?" +
                "\n 1. Cambiar contraseña." +
                "\n 2. Llenar info. de perfil." +
                "\n 3. Pedido: Seleccione (1) artículo que será enviado a su domicilio." +
                "\n 4. Salir");
        x = sc.nextInt();


        switch(x){
        case 1:{
               System.out.println("Ingrese su nueva contraseña.");
            String newcontra = sc.next();
               System.out.println("¡Listo! Su contraseña anterior era: "+ contra);
               contra = newcontra;
               System.out.println("Su contraseña actual es: " + contra);}
       break;
        case 2:
           System.out.println("Llene la información de su perfil:" +
                   "\n Dirección: ");
           direccion = sc.next();
           System.out.println("Número de teléfono: ");
           telefono = sc.nextInt();
           System.out.println("DNI: ");
           dni = sc.next();
           System.out.println("Nacionalidad: ");
           nacion = sc.next();
            System.out.println("¡Listo! Ya tenemos su información.");
           break;

           case 3:
           System.out.println("Seleccione el artículo que desea llevar a casa: " +
                   "\n 1. Lentes de sol" +
                   "\n 2. Bloqueador solar +50 spf" +
                   "\n 3. Bloqueador solar +35 spf" +
                   "\n 4. Bolsa de hielo" +
                   "\n 5. Otro");
           art = sc.nextInt();
               if(art==1)
                   System.out.println("¡Registrado! Escogió los lentes de sol.");
               else if(art==2)
               System.out.println("¡Registrado! Escogió el Bloqueador solar +50 spf.");
               else if(art==3)
                   System.out.println("¡Registrado! Escogió el Bloqueador solar +35 spf.");
               else if(art==4)
                   System.out.println("¡Registrado! Escogió la bolsa de hielo.");
               else
                   System.out.println("Disculpa. No lo tenemos disponible.");
break;
            case 4:
           System.out.println("Su orden fue completada con éxito a la hora: , la misma será enviada a su domicilio.");
       break;}


       }}



