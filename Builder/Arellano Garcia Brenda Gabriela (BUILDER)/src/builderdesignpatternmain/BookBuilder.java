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
public interface BookBuilder {
 
        public void buildTableOfContent();
        public void buildPreface();
        public void buildIntroduction();
        public void buildChapters();
        public void buildGlossary();
        public Book getBook();
}