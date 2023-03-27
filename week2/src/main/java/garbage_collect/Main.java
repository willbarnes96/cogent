/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garbage_collect;

/**
 *
 * @author willbarnes
 */
public class Main {
    
    int objId;
    
    Main(int objId){
        this.objId = objId;
        System.out.println("Created: " + this.objId);
    }
    
    public static void main(String[] args) {
        
        
        for (int i = 1; i < 11; i++){
            new Main(i);
            System.gc();
        }
        
        
        //System.gc(); //this is a request for the collector
    }

    @Override
    protected void finalize() throws Throwable {
        //super.finalize(); 
        
        System.out.println("Finalized: " + this.objId);
    }
    
    
    
}
