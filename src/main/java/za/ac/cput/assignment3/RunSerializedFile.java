/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3;

/**
 *
 * @author AphiweSkeyi
 */
public class RunSerializedFile {
public static void main(String[] args)  {
    ReadSerializedFile obj = new ReadSerializedFile();
    obj.openFile();
    obj.readFromFile();
   // obj.closeFile();
    
} 
}
