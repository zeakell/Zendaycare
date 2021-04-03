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
public class bayar {
    
    private String no_pembayaran, tanggal_pembayaran, jam_pembayaran, no_registrasi, total_pemabayaran, statuss;
    
    public bayar (String no_pembayaran, String tanggal_pembayaran,   String jam_pembayaran,String no_registrasi, String total_pemabayaran, String statuss)
    {
        this.no_pembayaran = no_pembayaran;
        this.tanggal_pembayaran = tanggal_pembayaran;
        this.jam_pembayaran = jam_pembayaran;
        this.no_registrasi = no_registrasi;
        this.statuss = statuss;
        this.total_pemabayaran = total_pemabayaran;
    }

    public bayar(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String callID()
    {
        return no_pembayaran;
    }
    
    public String calltanggal()
    {
        return tanggal_pembayaran;
    }
    
      public String calljam()
    {
        return jam_pembayaran;
    }
        public String callnoreg()
    {
        return no_registrasi;
    }
        
    public String callstat()
    {
        return statuss;
    }
        public String calldenda()
    {
        return total_pemabayaran;
    }
}
