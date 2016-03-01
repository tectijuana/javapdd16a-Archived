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
  System.out.println("printing technical table of content");
  book.setTableOfContent("technical table of content");
 }
 
 public void buildPreface() {
  System.out.println("printing preface");
  book.setTableOfContent("preface");
 }
 public void buildIntroduction() {
  System.out.println("printing technical introduction");
  book.setTableOfContent("technical introduction");
 }
 
 public void buildChapters() {
  System.out.println("printing technical chapters");
  book.setChapters("technical chapters");
 }
 
 public void buildGlossary() {
  System.out.println("printing technical glossary");
  book.setGlossary("Technical glossary");
 }
 
 public Book getBook() {
  return book;
 }
}