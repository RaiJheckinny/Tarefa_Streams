package filterGeneros;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();

        while(true){
            String numeroMenu = JOptionPane.showInputDialog(null, "1. Cadastrar \n2.Imprimir\n3.Sair","Menu",JOptionPane.QUESTION_MESSAGE);
            if(isTest(numeroMenu)){
                switch (numeroMenu){
                    case "1":
                            pessoas.addPessoas(cadastrar());
                        break;
                    case "2":
                            pessoas.imprimirNomeMasculino();
                            pessoas.imprimirNomeFeminino();
                        break;
                    case "3":
                        System.exit(0);
                        break;
                }
            }
        }
    }

    private static String cadastrar() {
        return JOptionPane.showInputDialog(null, "Digite o Nome uma virgula e a letra do genero | Ex: Joao,M","Menu",JOptionPane.QUESTION_MESSAGE);
    }

    private static Boolean isTest(String numeroMenu) {
        if(numeroMenu.equals("1") || numeroMenu.equals("2") || numeroMenu.equals("3")){
            return true;
        }
        JOptionPane.showMessageDialog(null,"Numero Invalido");
        return false;
    }
}