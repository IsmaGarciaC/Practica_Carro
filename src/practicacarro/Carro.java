/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacarro;

import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class Carro {
    private String id1;
    private String id2;
    private String id3;
    private String id4;
    private String id5;
    private String ID;
    private String color;
    private String marca;
    private String respuesta;
    private final String yes= "yes";
    private final String no="no";
    
    Scanner leer = new Scanner (System.in);
    
    public void crearID (){
        System.out.println("Agregar los 5 ID");
        id1 = leer.nextLine();
        id2 = leer.nextLine();
        id3 = leer.nextLine();
        id4 = leer.nextLine();
        id5 = leer.nextLine();      
    }
    
    public void buscarID(){
        System.out.println("Ingrese el ID a buscar...");
        ID = leer.nextLine();
        if (ID == null ? id1 == null : ID.equals(id1)) {
            color="Rojo";
            marca="Toyota";
            System.out.println("El auto con el id "+ID+" es marca "+marca+" y de color "+color);
        }else {
            if (ID == null ? id2 == null : ID.equals(id2)) {
                color="Blanco";
                marca="Hyundai";
                System.out.println("El auto con el id "+ID+" es marca "+marca+" y de color "+color);
            } else {
                if (ID == null ? id3 == null : ID.equals(id3)) {
                    color="Negro";
                    marca="KIA";
                    System.out.println("El auto con el id "+ID+" es marca "+marca+" y de color "+color);
                } else {
                    if (ID == null ? id4 == null : ID.equals(id4)) {
                        color="Gris";
                        marca="Chevrolet";
                        System.out.println("El auto con el id "+ID+" es marca "+marca+" y de color "+color);
                    } else {
                            if (ID == null ? id5 == null : ID.equals(id5)) {
                                color="Verde";
                                marca="Mercedez-Benz";
                                System.out.println("El auto con el id "+ID+" es marca "+marca+" y de color "+color);
                        } else {
                                System.out.println("El valor ingresado es INCORRECTO");
                                System.exit(0);
                        }
                    }
                }
            }
        }
    }
    public void listarID (){
        System.out.println("La lista del ID es...");
        System.out.println("1) "+id1);
        System.out.println("2) "+id2);
        System.out.println("3) "+id3);
        System.out.println("4) "+id4);
        System.out.println("5) "+id5);
    }
    public void eliminarID (){
        System.out.println("Ingrese el ID a eliminar...");
        ID = leer.nextLine();
        if (ID == null ? id1 == null : ID.equals(id1)) {
            System.out.println("El auto con el id "+ID+" ha sido eliminado");
        }else {
            if (ID == null ? id2 == null : ID.equals(id2)) {
                System.out.println("El auto con el id "+ID+" ha sido eliminado");
            } else {
                if (ID == null ? id3 == null : ID.equals(id3)) {
                    System.out.println("El auto con el id "+ID+" ha sido eliminado");
                } else {
                    if (ID == null ? id4 == null : ID.equals(id4)) {
                        System.out.println("El auto con el id "+ID+" ha sido eliminado");
                    } else {
                            if (ID == null ? id5 == null : ID.equals(id5)) {
                                System.out.println("El auto con el id "+ID+" ha sido eliminado");
                        } else {
                                System.out.println("El valor ingresado es INCORRECTO");
                                System.exit(0);
                        }
                    }
                }
            }
        }
    }
    public void actualizarId (){
        System.out.println("Desea actualizar ID? yes/no");
        respuesta= leer.nextLine();
            if (respuesta.equals(yes)) {
                id1=null;
                id2=null;
                id3=null;
                id4=null;
                id4=null;
                id5=null;
                System.out.println("Los valores han sido actualizados");
        }
            else{
                if (respuesta.equals(no)) {
                    System.out.println("Los valores no se han actualizado");
                } else {
                    System.out.println("El valor ingresado es INCORRECTO");
                    System.exit(0);
                }
            }
    }
}