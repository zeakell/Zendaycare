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
public class regis1 {
   private String no_registrasi,tanggal_registrasi, jam_registrasi, id_anak, id_orangtua, id_jenjang, id_service, harga_layanan, statuss ;
    
    public regis1(String no_registrasi, String tanggal_registrasi,  String jam_registrasi, String id_anak, String id_orangtua, String id_jenjang, String id_service, String harga_layanan, String statuss) {
        this.no_registrasi = no_registrasi;
        this.tanggal_registrasi = tanggal_registrasi;
        this.jam_registrasi = jam_registrasi;
        this.id_anak = id_anak;
        this.id_orangtua = id_orangtua;
        this.id_jenjang = id_jenjang;
        this.id_service = id_service;
        this.harga_layanan = harga_layanan;
        this.statuss = statuss;
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public String callNo()
    {
        return no_registrasi;
    }
    
     public String calltangreg()
    {
        return tanggal_registrasi;
    }
         public String calljamreg()
    {
        return jam_registrasi;
    }
        public String callanak()
    {
        return id_anak;
    }
            public String callIDortu()
    {
        return id_orangtua;
    }
    
     public String calljenjang()
    {
        return id_jenjang;
    }
    public String callservice()
    {
        return id_service;
    }
        public String callharga()
    {
        return harga_layanan;
    } 
    public String callstatus()
    {
        return statuss;
    } 
    
}
