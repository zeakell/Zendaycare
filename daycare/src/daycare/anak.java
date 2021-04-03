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
public class anak {

  private String id_anak, Nama_lengkap, TTL, jenis_kelamin, id_orangtua;
    public anak(String id_anak, String Nama_lengkap, String TTL, String jenis_kelamin, String id_orangtua)
    {
        this.id_anak = id_anak;
        this.Nama_lengkap = Nama_lengkap;
          this.TTL = TTL;
        this.jenis_kelamin = jenis_kelamin;
        this.id_orangtua = id_orangtua;
        
    }
    
        
    public String callIDa()
    {
        return id_anak;
    }
    
     public String callnama()
    {
        return Nama_lengkap;
    }
       public String callTtl()
    {
        return TTL;
    }
        public String calljenkel()
    {
        return jenis_kelamin;
    }
        
    public String callIDo()
    {
        return id_orangtua;
    }    
    
}
