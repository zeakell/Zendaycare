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
public class parent2 {
    private String id_orangtua, nama_orangtua, TTL, jenis_kelamin, pekerjaan;

     public parent2(String id_orangtua, String nama_orangtua, String TTL, String jenis_kelamin, String pekerjaan)
    {
        this.id_orangtua = id_orangtua;
        this.nama_orangtua = nama_orangtua;
        this.TTL = jenis_kelamin;
        
        this.jenis_kelamin = jenis_kelamin;
        this.pekerjaan = pekerjaan;
    
    }
    
      public String callid()
    {
        return id_orangtua;
    }
    public String callnama()
    {
        return nama_orangtua;
    }
    
    public String callttl()
    {
        return TTL;
    }
    public String callJK()
    {
        return jenis_kelamin;
    }
    
    public String callPekerjaan()
    {
        return pekerjaan;
    }
    
}
