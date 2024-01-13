package com.project;

import java.io.File;
import java.util.Collection;
/*

Help: https://www.baeldung.com/hibernate-one-to-many

*/

public class MainJPA {

   public static void main(String[] args) {
      
      String basePath = System.getProperty("user.dir") + "/data/";

      // Crear la carpeta 'data' si no existeix
      File dir = new File(basePath);
      if (!dir.exists()){
         if(!dir.mkdirs()) {
               System.out.println("Error en la creació de la carpeta 'data'");
         }
      }

      ManagerJPA.createSessionFactory();


      Ciutat2 ciu0 = ManagerJPA.addCiutat("Vancouver", "Canada", 98661);
      Ciutat2 ciu1 = ManagerJPA.addCiutat("Växjö", "Suècia", 35220);
      Ciutat2 ciu2 = ManagerJPA.addCiutat("Kyoto", "Canada", 5200461);

      ManagerJPA.addCiutada(ciu0.getCiutatId(), "Jotaro", "Kujoh", 40);
      Ciutada2 ciutada2 = ManagerJPA.addCiutada(ciu0.getCiutatId(), "Joseph", "Joestar", 70);
      ManagerJPA.addCiutada(ciu1.getCiutatId(), "Dio", "Brando", 160);
      Ciutada2 ciutada4 = ManagerJPA.addCiutada(ciu1.getCiutatId(), "Giorno", "Giovanna", 20);
      ManagerJPA.addCiutada(ciu2.getCiutatId(), "Josuke", "Higashikata", 16);
      Ciutada2 ciutada6 = ManagerJPA.addCiutada(ciu2.getCiutatId(), "Jolyne", "Kujoh", 20);
         
      Collection<?> ciutats = ManagerJPA.listCollection(Ciutat2.class, "");
      for(Object obj: ciutats) {
         Ciutat2 cObj = (Ciutat2) obj;
         System.out.println("Ciutadans de " + cObj.getNom() + ":");
         Collection<?> ciutadans = ManagerJPA.listCollection(Ciutada2.class, 
                                          "ciutatId=" + cObj.getCiutatId());
         for(Object obj2: ciutadans) {
            Ciutada2 cObj2 = (Ciutada2) obj2;
            System.out.println("    " + cObj2.toString());
         }
      }


      ManagerJPA.delete(Ciutada2.class, ciutada2.getCiutadaId());
      ManagerJPA.delete(Ciutada2.class, ciutada4.getCiutadaId());
      ManagerJPA.delete(Ciutada2.class, ciutada6.getCiutadaId());
      ManagerJPA.delete(Ciutat2.class, ciu1.getCiutatId());


      System.out.println("Ciutats:");
      Collection<?> llista = ManagerJPA.listCollection(Ciutat2.class, "");
      for(Object obj: ciutats) {
         Ciutat2 cObj = (Ciutat2) obj;
         System.out.println("  " + cObj);
      }
      System.out.println("Ciutadans:");
      llista = ManagerJPA.listCollection(Ciutada2.class, "");
      for(Object obj: llista) {
         Ciutada2 cObj = (Ciutada2) obj;
         System.out.println("  " + cObj);
      }


      ManagerJPA.close();

   }
}