package com.miriam.venta;

import exemplopaquetes.Coches;

public class Ventas {

    private Coches coche;
    private int prezo;
    private String marca;

    public Ventas() {
    }

    public Ventas(Coches coche, int prezo, String marca) {
        this.coche = coche;
        this.prezo = prezo;
        this.marca = marca;
    }

    public Coches getCoche() {
        return coche;
    }

    public int getPrezo() {
        return prezo;
    }

    public String getMarca() {
        return marca;
    }

    public void setCoche(Coches coche) {
        this.coche = coche;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ventas{" + "coche=" + coche + ", prezo=" + prezo + ", marca=" + marca + '}';
    }

}
