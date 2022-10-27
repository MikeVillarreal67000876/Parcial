/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.villarrealmike;

import java.util.ArrayList;
import java.util.List;

/**
 Mike Anderson Villarreal Agudelo
  67000876

 */
public class VillarrealMike {

    public static void main(String[] args) {
  List<Tarea>listaTareas=new ArrayList<Tarea>();
  Tarea t1=new Tarea();
  Tarea t2=new Tarea();
  
  
  t1.doEjecutar();
  t2.doEjecutar();
  listaTareas.add(t1);
  listaTareas.add(t2);
  
  
  
  List<Resultado>listaresultado=new ArrayList<Resultado>();
  Resultado r1=new Resultado();
  Resultado r2=new Resultado();
  
  r1.ejecutoConError();
  r1.ejecutoConAdvertencia();
  r1.ejecutoDi();
  
  r2.ejecutoConAdvertencia();
  r2.ejecutoConError();
  r2.ejecutoDi();
  
  listaresultado.add(r2);
  listaresultado.add(r1);
  
  

    }
}
