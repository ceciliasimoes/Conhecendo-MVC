/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import repository.IRepositorioConta;
import repository.RepositorioContaArrayList;


/**
 *
 * @author acsimoes
 */
public class ControllerConta {

    private IRepositorioConta repConta;

    public ControllerConta() {
        this.repConta = new RepositorioContaArrayList();
    }
    
    public Conta criarConta(int numero,int agencia,double saldo,String titular){
        Conta c = new Conta(numero, agencia, saldo, titular);
        return c;
    }

    public void inserirConta(Conta c) {
        this.repConta.inserirConta(c);
    }

    public void alterarConta(Conta c) {
        this.repConta.alterarConta(c);
    }

    public void removerConta(int numero) throws NotFoundContaException {
        Conta c = this.repConta.buscarConta(numero);
        if (c instanceof Conta) {
            this.repConta.removerConta(c);
        } else {
            throw new NotFoundContaException("Esta conta não foi encontrada!");
        }
    }

    public Conta buscarConta(int numero) {
        return this.repConta.buscarConta(numero);
    }

    public ArrayList<Conta> buscarTodas() {
        return repConta.buscarTodas();
    }
}
