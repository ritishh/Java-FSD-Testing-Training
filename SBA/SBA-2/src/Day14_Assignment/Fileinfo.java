package Day14_Assignment;

import java.io.File; 

class Fileinfo {  
    public static void main(String[] args) {  
        // Creating file object  
        File f1 = new File("F:FileOperationExample.txt");  
        if (f1.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f1.getName());  
   
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + f1.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + f1.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + f1.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + f1.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }  
    }  
}  