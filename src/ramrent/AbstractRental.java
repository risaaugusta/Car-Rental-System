/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramrent;

/**
 *
 * @author RISA
 */
abstract class info {
    public abstract void KategoriMobil(int id_mobil);
    public abstract void KategoriMobil(int id_mobil, String merk);
}

public class AbstractRental extends info{
    private int id_mobil;
    private String merk;
    protected int hari;
    protected int denda;
    //    overloading
    public void KategoriMobil(int id_mobil){
        this.id_mobil = id_mobil;
    }
    
    public void KategoriMobil(int id_mobil,String merk){
        this.id_mobil = id_mobil;
        this.merk = merk;
    }
    
    public void denda(){
        denda = hari*50000;
    }
}

class Pembayaran extends AbstractRental{
    @Override
    public void denda(){
        super.denda = super.hari*50000;
        System.out.println("Denda yang harus dibayar adalah "+denda);
    }
}