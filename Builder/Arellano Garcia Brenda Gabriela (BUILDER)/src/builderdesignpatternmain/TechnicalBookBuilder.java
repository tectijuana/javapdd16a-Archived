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
public class TechnicalBookBuilder implements BookBuilder{
 private Book book;
 
 public TechnicalBookBuilder()
 {
  book=new Book();
 }
 public void buildTableOfContent() {
  System.out.println("Imprimir mesa técnica del contenido");
  book.setTableOfContent("Mesa técnica del contenido");
 }
 
 public void buildPreface() {
  System.out.println("Prefacio de impresión");
  book.setTableOfContent("Prefacio");
 }
 public void buildIntroduction() {
  System.out.println("Imprimir introducción técnica");
  book.setTableOfContent("Introducción técnica");
 }
 
 public void buildChapters() {
  System.out.println("Imprimir capítulos técnicos");
  book.setChapters("Capítulos técnicos");
 }
 
 public void buildGlossary() {
  System.out.println("Imprimir glosario técnico");
  book.setGlossary("Glosario técnico");
 }
 
 public Book getBook() {
  return book;
 }
}