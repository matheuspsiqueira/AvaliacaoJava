import javax.swing.JOptionPane;

import br.com.escolaweb.controller.FuncionarioController;
import br.com.escolaweb.model.Funcionario;

public class App {
    public static void main(String[] args) {
        try {
            Funcionario funcionarios = new Funcionario();
            funcionarios.setNome("Matheus Siqueira");
            funcionarios.setEmail("matheus@email.com");
            funcionarios.setSenha("123");
            FuncionarioController.cadastrar(funcionarios);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            System.err.println("Erro >>> " + e);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!" + e.getMessage());
        }
    }
}
