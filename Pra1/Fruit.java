package Pra1;

public class Fruit implements Named, Perishable {
    private Named nameFunc;
    private Perishable expiryFunc;
  
    public Fruit(Named nameFunc, Perishable expiryFunc) {
        this.nameFunc = nameFunc;
        this.expiryFunc = expiryFunc;                                                                                         
    }                                                                                                                                                                                                                                               
    
    public String getName() {                                                                                                 
        return this.nameFunc.getName();                                                                                       
    }                                                                                                                                                                                                                                               
    
    public int getDaysToExpiry() {                                                                                            
        return this.expiryFunc.getDaysToExpiry();                                                                             
    }                                                                                                                                                                                                                                               
    
    @Override                                                                                                               
    public String toString() {                                                                                                
        return getName() + " (expires in " + getDaysToExpiry() + " days)";                                                    
    }                                                                                                                     
}
