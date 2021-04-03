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
public class parent {
     private String id_orangtua, nama_orangtua, TTL, jenis_kelamin, pekerjaan, no_handphone, provinsi, kabkota, alamat, email, username, katasandi;
    
    public parent(String id_orangtua, String nama_orangtua, String TTL, String jenis_kelamin, String pekerjaan, String no_handphone, String provinsi, String kabkota,String alamat, String email, String username, String katasandi)
    {
        this.id_orangtua = id_orangtua;
        this.nama_orangtua = nama_orangtua;
        this.TTL = jenis_kelamin;
        
        this.jenis_kelamin = jenis_kelamin;
        this.pekerjaan = pekerjaan;
        this.no_handphone = no_handphone;
        
         
        this.provinsi = provinsi;
        this.kabkota = kabkota;
        this.alamat = alamat;
        this.email = email;
        this.username = username;
        this.katasandi = katasandi;
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
    public String callphone()
    {
        return no_handphone;
    }
    
    public String callProvinsi()
    {
        return provinsi;
    }
    public String callkabkot()
    {
        return kabkota;
    }
    
    public String callalamat()
    {
        return alamat;
    }
    
    
        public String callemail()
    {
        return email;
    }
    
    public String callusern()
    {
        return username;
    }
    public String callsandi()
    {
        return katasandi;
    }
}
