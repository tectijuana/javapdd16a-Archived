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
  System.out.println("printing fictional table of content");
  book.setTableOfContent("fictional table of content");
 }
 
 public void buildPreface(){
  System.out.println("printing preface");
  book.setTableOfContent("preface");
 }
 public void buildIntroduction() {
  System.out.println("printing fictional introduction");
  book.setTableOfContent("fictional introduction");
 }
 
 public void buildChapters() {
  System.out.println("printing fictional chapters");
  book.setChapters("fictional chapters");
 }
 
 public void buildGlossary() {
  System.out.println("printing fictional glossary");
  book.setGlossary("Fictional glossary");
 }
 
 public Book getBook() {
  return book;
 }
 
}