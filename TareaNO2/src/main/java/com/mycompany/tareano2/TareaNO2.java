/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareano2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juliotobar
 */
public class TareaNO2 {

     Scanner Entrada=new Scanner(System.in);
    
    ArrayList<Alumnos> alumnos =new ArrayList<>();
    public void Clases( ArrayList<Alumnos> alumnos ){
    this.alumnos= alumnos;
   
    }

    public void Inicio(){
        
       
        String option="";
        
        while(!option.equals("0")){
        
       System.out.println("------TAREA NO2----");
       System.out.println("1. Ingresar Alumnos");
       System.out.println("2. Ver listado de alumnos");
       option=Entrada.nextLine();
       switch(option){
           case "1" -> IngresarAlumnos();
               
           case "2" -> VerAlumnos();
               
           default ->  System.out.println("xxxxxxxxxxxx （＞﹏＜）" );
             
       
       }
    
    }
        
    
    }
      int contador=0;
    
      public void IngresarAlumnos(){
        String nombre="";
        String carne="";
        String edad="";
        String genero="";
         System.out.println("------Ingresar alumnos-----");
         System.out.println("Escriba salir escriba: Salir");
         
         while (true){
          System.out.println("Ingresar nombre");
          nombre=Entrada.nextLine();
          if (nombre.equals("Salir"))
                  {
                  break;
                  }
            System.out.println("Ingresar carne");
          carne = Entrada.nextLine();
           System.out.println("Ingresar edad");
           edad=Entrada.nextLine();
            System.out.println("Ingresar Genero");
          genero=Entrada.nextLine();
         
             if(carne.equals("") || nombre.equals("") || edad.equals("") || genero.equals("")){
           System.out.println(" No espacios vacios");
           break;
             }
             if (!edad.matches("[0-9].*") || !carne.matches("[0-9].*") ){
           System.out.println("Caracter invalido en edad o carnet");
            break;
           }

          while(alumnos.isEmpty()){
              
            
                Alumnos alu= new Alumnos();
         alu.setNombre(nombre);
         alu.setCarnet(carne);
         alu.setEdad(edad);
         alu.setGenero(genero);
           alumnos.add(0,alu);
                   System.out.print(" Ingresados");
                   contador++;
                   break;
             
         }
                   
              
          boolean registrado=false;
         for(int i=0;i<alumnos.size();i++)
         { if(alumnos.get(i)!=null){
            
          
           
             if(alumnos.get(i).getNombre().equals(nombre)|| alumnos.get(i).getCarnet().equals(carne)
                     ) {
              System.out.println("Ya existe");
              registrado=true;
              break;
             }
             
             
         }
         
         }
         if(!registrado ){
         Alumnos alu= new Alumnos();
         alu.setNombre(nombre);
         alu.setCarnet(carne);
         alu.setEdad(edad);
         alu.setGenero(genero);
            
             
                    alumnos.add(contador,alu);
                   System.out.print(" Ingresados");
              contador++;
            
                    
                    
        
         }
         }
        }
         public void VerAlumnos(){
         int r=0;
         System.out.println("Listado");
          if(alumnos.isEmpty())
             { System.out.println("No ");
             }
         
          else{
         for(int i=0; i<alumnos.size();i++)
         {
             r=i+1;
           System.out.println("No "+r+" Nombre: "+alumnos.get(i).getNombre()+" Carnet: "
          +alumnos.get(i).getCarnet()+" Edad: "+alumnos.get(i).getEdad()+" Genero: "
                   +alumnos.get(i).getGenero() );
        
         }
          }
         
        /* catch( NullPointerException er){
             
             System.out.print("Vacio?");
            }*/
             
         }
         
    

    public static void main(String[] args) {
        
        
        TareaNO2 t2=new TareaNO2();
        t2.Inicio();
       
    }
}
