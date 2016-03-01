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
public class BookWriter {
 
 BookBuilder bookBuilder;
 
 public BookWriter(BookBuilder bookBuilder) {
  super();
  this.bookBuilder = bookBuilder;
 }
 
 public Book getBook()
 {
  return this.bookBuilder.getBook();
 }
 
 public void printBook()
 {
  this.bookBuilder.buildTableOfContent();
  this.bookBuilder.buildPreface();
  this.bookBuilder.buildIntroduction();
  this.bookBuilder.buildChapters();
  this.bookBuilder.buildGlossary();
 }
}