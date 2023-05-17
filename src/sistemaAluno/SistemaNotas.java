package sistemaAluno;

import javax.swing.*;
import java.util.*;

public class SistemaNotas {

    public static void main(String[] args) {
        try {
            String login = JOptionPane.showInputDialog("Entre com o login");
            Integer senha = Integer.valueOf(JOptionPane.showInputDialog("Entre com a senha"));

            Permissao usuario1 = new Secretaria(new Logs(login, senha));
            Permissao usuario2 = new Diretor(new Logs(login, senha));

            new EntradaSistema(usuario1);

            List<Aluno> alunos = new ObterAlunos().obterLista();

            Map<CondicaoAprovacao, List<Aluno>> condicaoAprovacaoListMap = new MapsAlunos().mapsCondicao(alunos);

            for (Aluno listAlunos : alunos) {
                System.out.println(listAlunos.toString());
            }


            for(Map.Entry<CondicaoAprovacao,List<Aluno>> iterator : condicaoAprovacaoListMap.entrySet()) {
                System.out.println(iterator.getKey()+"\n"+iterator.getValue());
            }

        } catch (NumberFormatException | NullPointerException e) {
            e.printStackTrace();
            e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();

        }
    }
}