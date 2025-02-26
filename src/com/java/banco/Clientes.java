package com.java.banco;

public class Clientes {
    private String nomeCliente;
    private int idadeCliente;
    private float saldoCliente;

    public String toString(){
        return String.format("Cliente: " + nomeCliente + "\nIdade: %d\nSaldo: %.2f", idadeCliente, saldoCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public float getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(float saldoCliente) {
        this.saldoCliente = saldoCliente;
    }
}
