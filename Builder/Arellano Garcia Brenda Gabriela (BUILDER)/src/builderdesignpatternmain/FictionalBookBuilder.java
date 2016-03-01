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
public class FictionalBookBuilder implements BookBuilder{
 private Book book;
 
 public FictionalBookBuilder()
 {
  book=new Book();
 }
 public void buildTableOfContent() {
  System.out.println("Imprimir la tabla de contenidos de ficción");
  book.setTableOfContent("Tabla de contenidos de ficción");
 }
 
 public void buildPreface(){
  System.out.println("Prefacio de impresión");
  book.setTableOfContent("Prefacio");
 }
 public void buildIntroduction() {
  System.out.println("Imprimir introducción de ficción");
  book.setTableOfContent("Introducción de ficción");
 }
 
 public void buildChapters() {
  System.out.println("Imprimir capítulos de ficción");
  book.setChapters("Capítulos de ficción");
 }
 
 public void buildGlossary() {
  System.out.println("Imprimir glosario de ficción");
  book.setGlossary("Glosario de ficción");
 }
 
 public Book getBook() {
  return book;
 }
 
}