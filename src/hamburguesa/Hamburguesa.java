/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamburguesa;

/**
 *
 * @author cibarba
 */
public class Hamburguesa implements Restaurante {
    private String carne;
    private boolean crema;
    private boolean mayonesa;
    private boolean catsup;
    private boolean lechuga;
    private boolean jitomate;
    private boolean cebolla;
    private boolean queso;
    
    public Hamburguesa(){}
    
    public Hamburguesa(String carne, boolean crema, boolean mayonesa, boolean catsup, boolean lechuga, boolean jitomate, boolean cebolla, boolean queso){
        this.carne = carne;
        this.crema = crema;
        this.mayonesa = mayonesa;
        this.catsup = catsup;
        this.lechuga = lechuga;
        this.jitomate = jitomate;
        this.cebolla = cebolla;
        this.queso = queso;
    }

    /**
     * @return the carne
     */
    public String getCarne() {
        return carne;
    }

    /**
     * @param carne the carne to set
     */
    public void setCarne(String carne) {
        this.carne = carne;
    }

    /**
     * @return the crema
     */
    public boolean isCrema() {
        return crema;
    }

    /**
     * @param crema the crema to set
     */
    public void setCrema(boolean crema) {
        this.crema = crema;
    }

    /**
     * @return the mayonesa
     */
    public boolean isMayonesa() {
        return mayonesa;
    }

    /**
     * @param mayonesa the mayonesa to set
     */
    public void setMayonesa(boolean mayonesa) {
        this.mayonesa = mayonesa;
    }

    /**
     * @return the catsup
     */
    public boolean isCatsup() {
        return catsup;
    }

    /**
     * @param catsup the catsup to set
     */
    public void setCatsup(boolean catsup) {
        this.catsup = catsup;
    }

    /**
     * @return the lechuga
     */
    public boolean isLechuga() {
        return lechuga;
    }

    /**
     * @param lechuga the lechuga to set
     */
    public void setLechuga(boolean lechuga) {
        this.lechuga = lechuga;
    }

    /**
     * @return the jitomate
     */
    public boolean isJitomate() {
        return jitomate;
    }

    /**
     * @param jitomate the jitomate to set
     */
    public void setJitomate(boolean jitomate) {
        this.jitomate = jitomate;
    }

    /**
     * @return the cebolla
     */
    public boolean isCebolla() {
        return cebolla;
    }

    /**
     * @param cebolla the cebolla to set
     */
    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    /**
     * @return the queso
     */
    public boolean isQueso() {
        return queso;
    }

    /**
     * @param queso the queso to set
     */
    public void setQueso(boolean queso) {
        this.queso = queso;
    }

    @Override
    public void comprar() {
          
    }

    @Override
    public void vender() {
        
    }
    
}
