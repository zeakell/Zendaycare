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
public class jenjangs {
    private String id_jenjang, Nama_jenjang, usia;
    
    public jenjangs (String id_jenjang, String Nama_jenjang, String usia)
    {
        this.id_jenjang = id_jenjang;
        this.Nama_jenjang = Nama_jenjang;
        this.usia = usia;
    }
    
    public String callID()
    {
        return id_jenjang;
    }
    
     public String callnama()
    {
        return Nama_jenjang;
    }
        public String callusia()
    {
        return usia;
    }
    

}
