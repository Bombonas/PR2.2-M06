package com.project;

import java.io.File;
import java.util.Collection;
/*

Help: https://www.baeldung.com/hibernate-one-to-many

*/

public class Main {

   public static void main(String[] args) {
      
      String basePath = System.getProperty("user.dir") + "/data/";

      // Crear la carpeta 'data' si no existeix
      File dir = new File(basePath);
      if (!dir.exists()){
         if(!dir.mkdirs()) {
               System.out.println("Error en la creació de la carpeta 'data'");
         }
      }

      Manager.createSessionFactory();


      Ciutat ciu0 = Manager.addCiutat("Vancouver", "Canada", 98661);
      Ciutat ciu1 = Manager.addCiutat("Växjö", "Suècia", 35220);
      Ciutat ciu2 = Manager.addCiutat("Kyoto", "Canada", 5200461);


      Manager.addCiutada(ciu0.getCiutatId(), "Jotaro", "Kujoh", 40);
      Ciutada ciutada2 = Manager.addCiutada(ciu0.getCiutatId(), "Joseph", "Joestar", 70);
      Manager.addCiutada(ciu1.getCiutatId(), "Dio", "Brando", 160);
      Ciutada ciutada4 = Manager.addCiutada(ciu1.getCiutatId(), "Giorno", "Giovanna", 20);
      Manager.addCiutada(ciu2.getCiutatId(), "Josuke", "Higashikata", 16);
      Ciutada ciutada6 = Manager.addCiutada(ciu2.getCiutatId(), "Jolyne", "Kujoh", 20);
         
      Collection<?> ciutats = Manager.listCollection(Ciutat.class, "");
      for(Object obj: ciutats) {
         Ciutat cObj = (Ciutat) obj;
         System.out.println("Ciutadans de " + cObj.getNom() + ":");
         Collection<?> ciutadans = Manager.listCollection(Ciutada.class, 
                                          "ciutatId=" + cObj.getCiutatId());
         for(Object obj2: ciutadans) {
            Ciutada cObj2 = (Ciutada) obj2;
            System.out.println("    " + cObj2.toString());
         }
      }


      Manager.delete(Ciutada.class, ciutada2.getCiutadaId());
      Manager.delete(Ciutada.class, ciutada4.getCiutadaId());
      Manager.delete(Ciutada.class, ciutada6.getCiutadaId());
      Manager.delete(Ciutat.class, ciu1.getCiutatId());


      System.out.println("Ciutats:");
      Collection<?> llista = Manager.listCollection(Ciutat.class, "");
      for(Object obj: ciutats) {
         Ciutat cObj = (Ciutat) obj;
         System.out.println("  " + cObj);
      }
      System.out.println("Ciutadans:");
      llista = Manager.listCollection(Ciutada.class, "");
      for(Object obj: llista) {
         Ciutada cObj = (Ciutada) obj;
         System.out.println("  " + cObj);
      }


      Manager.close();

   }
}