/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author eduar
 */
public class POJO {

    private String usu;
    private String contr;

    public POJO(String usu, String contr) {
        this.usu = usu;
        this.contr = contr;
    }

    public String getContr() {
        return contr;
    }

    public void setContr(String contr) {
        this.contr = contr;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("POJO{");
        sb.append("usu=").append(usu);
        sb.append(", contr=").append(contr);
        sb.append('}');
        return sb.toString();
    }

}
