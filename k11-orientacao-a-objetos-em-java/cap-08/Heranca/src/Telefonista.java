/*VERS�O 1*/
public class Telefonista extends Funcionario{
	private int estacaoDeTrabalho;

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}	
}
/*VERS�O 2*/
/*
class Telefonista extends Funcionario {
	private int estacaoDeTrabalho;

	public void mostraDados() {
		super.mostraDados();
		System.out.println("Esta��o de Trabalho " + this.estacaoDeTrabalho); 
	}

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
}
*/