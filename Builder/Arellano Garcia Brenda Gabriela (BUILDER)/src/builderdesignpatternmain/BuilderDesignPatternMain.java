/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builderdesignpatternmain;
/**
 *
 * @author BGAG
 */
public class BuilderDesignPatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
  System.out.println("Impresión de libro técnico:");
  BookBuilder technialbookBuilder=(BookBuilder) new TechnicalBookBuilder();
  BookWriter technicalBookWriter=new BookWriter(technialbookBuilder);
  technicalBookWriter.printBook();
  Book technicalbook=technicalBookWriter.getBook();
  System.out.println("Libro Impreso técnica:"+technicalbook);
  System.out.println("******************************************");
  System.out.println("La impresión de libros de ficción:");
  FictionalBookBuilder fictionalbookBuilder=new FictionalBookBuilder();
  BookWriter fictionalBookWriter=new BookWriter(fictionalbookBuilder);
  fictionalBookWriter.printBook();
  Book fictionalbook=fictionalBookWriter.getBook();
  System.out.println("Libro libro de ficción impreso:"+fictionalbook);
 }
}