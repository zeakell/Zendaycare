/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycare;

/**
 *
 * @author KH
 */
public class aktifitas {
         private String jam, activity;
    
    public aktifitas(String jam, String activity)
    {
        this.jam = jam;
        this.activity = activity;
     
    }
    
    public String calljam()
    {
        return jam;
    }
    
     public String callaksi()
    {
        return activity;
    }
}
