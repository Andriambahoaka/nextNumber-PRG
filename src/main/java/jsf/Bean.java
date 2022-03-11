/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Mahery
 */
@Named(value = "bean")
@RequestScoped
public class Bean {

   /**
    * Creates a new instance of Bean
    */
   public Bean() {
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

}
