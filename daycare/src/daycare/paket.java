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
public class paket 
{
     private String id_service, nama_service, harga;
    
    public paket(String id_service, String nama_service, String harga)
    {
        this.id_service = id_service;
        this.nama_service = nama_service;
        this.harga = harga;
    }

 
    
    public String callID()
    {
        return id_service;
    }
    
     public String callnama()
    {
        return nama_service;
    }
        public String callharga()
    {
        return harga;
    }
}
