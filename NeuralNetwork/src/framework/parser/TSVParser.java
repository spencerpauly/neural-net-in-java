/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.parser;

/**
 *
 * @author Spencer
 */
public class TSVParser {
    
    String fileName = "";
    String filePath = "";
    Range range;
    
    public TSVParser(String fileName) {
        this.fileName = fileName;
        this.range = new Range();
    }
    
    public TSVParser(String fileName, Range range) {
        this.fileName = fileName;
        this.range = range;
        
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName; 
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    
    
    
    
}
