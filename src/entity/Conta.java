package entity;

import java.util.Objects;

public class Conta {

    public Conta(int numero1, int agencia1, double saldo1, String titular1) {
    }

    private int numero;
    private int agencia;
    private double saldo;
    private String titular;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o != this) {
                if (o instanceof Conta c) {
                    return (c.getNumero() == this.getNumero());
                }
            } else {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.numero;
        hash = 37 * hash + this.agencia;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.titular);
        return hash;
    }

}
