package filterGeneros;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
        return genero.stream().flatMap(List::stream).reduce("", (accumulator, element) -> accumulator + " \n" + element);

    }
    }


