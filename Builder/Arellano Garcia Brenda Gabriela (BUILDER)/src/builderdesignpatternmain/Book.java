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
public class Book {
String introduction;
 String tableOfContent;
 String preface;
 String chapters;
 String glossary;
  
 public void setIntroduction(String introduction) {
  this.introduction = introduction;
 }
 public void setTableOfContent(String tableOfContent) {
  this.tableOfContent = tableOfContent;
 }
 public void setPreface(String preface) {
  this.preface = preface;
 }
 public void setChapters(String chapters) {
  this.chapters = chapters;
 }
 public void setGlossary(String glossary) {
  this.glossary = glossary;
 }
}