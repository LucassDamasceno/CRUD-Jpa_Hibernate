package aulaJPA;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Lucas");
		a1.setIdade(18);
		a1.setMatricula("123456789");
		
		Aluno a2 = new Aluno();
		a2.setNome("Rafael");
		a2.setIdade(22);
		a2.setMatricula("123456");
		
		Aluno a3 = new Aluno();
		a3.setNome("Gustavo");
		a3.setIdade(20);
		a3.setMatricula("123");
		
		AlunoController con = new AlunoController();
//		con.salvar(a1);
//		con.salvar(a2);
//		con.salvar(a3);
//		con.remover(a1);
		
		con.listar();
		
		List<Aluno> alunos = con.listar();
		
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Nome" + alunos.get(i).getNome() +
							 "- idade:" +  alunos.get(i).getIdade()+
							 " matricula: "+alunos.get(i).getMatricula());
		}
	}
}
