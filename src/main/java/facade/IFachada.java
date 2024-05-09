package facade;

import java.util.ArrayList;

import entity.Conta;
import entity.NotFoundContaException;

public interface IFachada {

    public void inserirConta(Conta c);

    public void alterarConta(Conta c);

    public void removerConta(int numero) throws NotFoundContaException;

    public Conta buscarConta(int numero);

    public ArrayList<Conta> buscarTodas();

}
