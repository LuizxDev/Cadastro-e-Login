package view;

import javax.swing.JOptionPane;

import controller.LoginCtrl;
import model.UsuarioModel;

public class Aplicacao {
    public static void main(String[] args) throws Exception {

        LoginCtrl crtl = new LoginCtrl();

        UsuarioModel usuario = new UsuarioModel();

        String[] opcoes = { "1. Cadastro", "2. Login", "3. Excluir Cadastro" };

        int escolha = JOptionPane.showOptionDialog(null, "Selecione uma opção:",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                usuario.setLogin_usuario(
                        JOptionPane.showInputDialog(null, "Digite seu login:", "Login", JOptionPane.PLAIN_MESSAGE));

                usuario.setSenha_usuario(
                        JOptionPane.showInputDialog(null, "Digite sua senha:", "Senha", JOptionPane.PLAIN_MESSAGE));

                crtl.cadastrar(usuario.getLogin_usuario(), usuario.getSenha_usuario());

                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);

                break;
            case 1:
                usuario.setLogin_usuario(
                        JOptionPane.showInputDialog(null, "Digite seu login:", "Login", JOptionPane.PLAIN_MESSAGE));
                usuario.setSenha_usuario(
                        JOptionPane.showInputDialog(null, "Digite sua senha:", "Senha", JOptionPane.PLAIN_MESSAGE));
                crtl.autenticacaoUsuario(usuario.getLogin_usuario(), usuario.getSenha_usuario());
                break;
            case 2:
                usuario.setId(Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Digite seu ID:", "Login", JOptionPane.PLAIN_MESSAGE)));
                crtl.excluirCadastro(usuario.getId());

                break;
        }

    }
}
