
package za.ac.cput.assignment3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
   
/**
 *
 * @author AphiweSkeyi
 */
public class ReadSerializedFile {
    private ObjectInputStream input;
    Customer cus;
    Supplier supp;
    Customer[] customerArr = new Customer[6];
    Supplier[] supplierArr = new Supplier[5];
    public void openFile(){
        try{
            input = new ObjectInputStream(new FileInputStream("stakeholder.ser"));  
            System.out.println("Opening file");
        }
        catch(IOException ioe){
            System.out.println("Error" + ioe.getMessage());   
        }
    }
    
    public void closeFile(){
        try{
            input.close();
        }
        catch(IOException ioe){
            System.out.println("Error" + ioe.getMessage());
        }
    }
    
    public void readFromFile(){
        try{
            while(true){
                cus = (Customer)input.readObject();
                System.out.println(cus);
            /**for(int i = 0; i < supplierArr.length; i++){
                supplierArr[i] = (Supplier)input.readObject();
                System.out.println(supplierArr[i]);**/
            }   
        }
        catch(ClassNotFoundException ioe){
            System.out.println("Class error" + ioe);
        }
        catch(IOException ioe){
            System.out.println("Error" + ioe);
        }
        finally{
            closeFile();
            System.out.println("File is closed");
        }
    }
    
    
   
}
