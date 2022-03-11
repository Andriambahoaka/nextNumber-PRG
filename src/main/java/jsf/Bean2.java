/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Mahery
 */
@Named(value = "bean2")
@RequestScoped
public class Bean2 {

   /**
    * Creates a new instance of Bean2
    */
   public Bean2() {
   }

   private int nombre;

   public int getNombre() {
      return nombre;
   }

   public void setNombre(int nombre) {
      this.nombre = nombre;
   }

   public List<Integer> getNombresSuivants() {
      int nb = 5;
      List<Integer> l = new ArrayList<>(nb);
      for (int i = nombre; i < nombre + nb; i++) {
         l.add(i);
      }
      return l;
   }

   public String afficher() {
      return "affichage_3?nb=" + nombre + "&amp;faces-redirect=true";
   }

   public String afficher_4() {
      return "affichage__4?nb=" + nombre + "&amp;faces-redirect=true";
   }

}
