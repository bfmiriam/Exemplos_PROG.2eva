package com.miriam.taller;

import com.miriam.venta.Ventas;
import exemplopaquetes.Coches;
import javax.swing.JOptionPane;

public class Taller {

    private Coches matricula;
    private float factura;

    public Taller() {
    }

    public Taller(Coches matricula, float factura) {
        this.matricula = matricula;
        this.factura = factura;
    }

    public Coches getMatricula() {
        return matricula;
    }

    public float getFactura() {
        return factura;
    }

    public void setMatricula(Coches matricula) {
        this.matricula = matricula;
    }

    public void setFactura(float factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Taller{" + "matricula=" + matricula + ", factura=" + factura + '}';
    }

    public void costeArranxo(String matricula, Ventas coh1) {

        float desconto;
        float coste = Float.parseFloat(JOptionPane.showInputDialog("precio coche"));
        if (matricula.equalsIgnoreCase(coh1.getCoche().getMatricula())) {
            System.out.println("mercado en CochesVigo");
            desconto = 0.8f;

        } else {
            System.out.println("non mercado en CochesVigo");
            desconto = 1;
        }

        coste = coste * desconto;
        System.out.println("coste=" + coste);
    }
}
