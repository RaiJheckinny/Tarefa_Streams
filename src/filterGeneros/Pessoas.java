package filterGeneros;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Pessoas {
    List<List<String>> masculino = new LinkedList<>();
    List<List<String>> feminino = new LinkedList<>();

    public void addPessoas(String dados){
         List<String> arrayPessoa = Arrays.asList(dados.split(","));

        if(arrayPessoa.get(1).toUpperCase().equals("M")){
            masculino.add(arrayPessoa);
            JOptionPane.showMessageDialog(null,"Cadastro com sucesso");
        } else if (arrayPessoa.get(1).toUpperCase().equals("F")){
            feminino.add(arrayPessoa);
            JOptionPane.showMessageDialog(null,"Cadastro com sucesso");
        } else {
            JOptionPane.showMessageDialog(null,"Genero Invalido");
        }
    }
    public void imprimirNomeFeminino(){
        JOptionPane.showMessageDialog(null,"Lista Feminina " + stringNomeGenero(feminino));
    }
    public void imprimirNomeMasculino(){
        JOptionPane.showMessageDialog(null,"Lista Masculina " + stringNomeGenero(masculino));
    }
    public String stringNomeGenero(List<List<String>>genero){
        StringBuilder valorString = new StringBuilder();
        genero.forEach(elemento -> {
            for(String item : elemento){
                valorString.append(item).append("\n");
            }
        });
        return valorString.toString();
    }
    public List<List<String>> getFeminino(){
        return feminino;
    }
    public List<List<String>> getMasculino(){
        return masculino;
    }
    }


