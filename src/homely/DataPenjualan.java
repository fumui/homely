/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homely;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author indbr
 */
public class DataPenjualan {
    String namaPemesan, area, tipeRumah;
    int id, luasTanahTersedia, harga, lamaCicilan, cicilanBln;
    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    public DataPenjualan(
            int id,
            String namaPemesan, String area, String tipeRumah,
            int luasTanahTersedia, int harga, int lamaCicilan,
            int cicilanBln
    ) {
        this.namaPemesan = namaPemesan;
        this.area = area;
        this.tipeRumah = tipeRumah;
        this.id = id;
        this.luasTanahTersedia = luasTanahTersedia;
        this.harga = harga;
        this.lamaCicilan = lamaCicilan;
        this.cicilanBln = cicilanBln;
    }

    public Object[] toRowData() {
        return new Object[]{
            this.namaPemesan,
            this.area,
            this.tipeRumah,
            this.luasTanahTersedia,
            nf.format(this.harga),
            this.lamaCicilan,
            nf.format(this.cicilanBln)
        };
    }
}
