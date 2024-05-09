/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import entity.Conta;
import entity.ControllerConta;
import entity.NotFoundContaException;
import java.util.ArrayList;

/**
 *
 * @author acsimoes
 */
public class Fachada implements IFachada {

    private final ControllerConta controladorConta;
//    private Fachada instance;
//
//    public Fachada getInstance() {
//        if (this.instance == null) {
//            this.instance = new Fachada();
//        }
//        return instance;
//    }

   public Fachada() {
        this.controladorConta = new ControllerConta();
    }
    
    public Conta criarConta(int numero,int agencia,double saldo,String titular){
        return this.controladorConta.criarConta(numero, agencia, saldo, titular);
    }

    @Override
    public void inserirConta(Conta c) {
        this.controladorConta.inserirConta(c);
    }

    @Override
    public void alterarConta(Conta c) {
        this.controladorConta.alterarConta(c);
    }

    @Override
    public void removerConta(int numero) throws NotFoundContaException {
        this.controladorConta.removerConta(numero);
    }

    @Override
    public Conta buscarConta(int numero) {
        return this.controladorConta.buscarConta(numero);
    }

    @Override
    public ArrayList<Conta> buscarTodas() {
        return this.controladorConta.buscarTodas();
    }

}
