
public class Paciente extends Pessoa {
	private String tiposangue;
	private int codPac;
	private int doar;
	private int qtdDoacao;

	public int getQtdDoacao() {			
		return qtdDoacao;
	}

	public void setQtdDoacao(int qtdDoacao) {
		this.qtdDoacao = qtdDoacao;
	}

	public int getDoar() {
		return doar;
	}

	public void setDoar(int doar) {
		this.doar = doar;
	}

	public String getTiposangue() {
		return tiposangue;
	}

	public void setTiposangue(String tiposangue) {
		this.tiposangue = tiposangue;
	}

	public int getCodPac() {
		return codPac;
	}

	public void setCodPac(int codPac) {
		this.codPac = codPac;
	}

	public void mostrarPaciente() {
		System.out.println("Paciente: " + getNome());
		System.out.println("Data de Nascimento: " + getDatNasc());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Estado Civil: " + getEstadocivil());
		System.out.println("Tipo de Sanguíneo: " + getTiposangue());
		System.out.println("Codigo do paciente: " + getCodPac());
	}

	public void doarSangue() throws Exception   
	{
		if (qtdDoacao >= 2) 
		{
			throw new Exception("Paciente não pode doar mais de uma vez no ano.");
		}
		
		else if (qtdDoacao <=0)

		{
			throw new Exception("Paciente não fez doação.");
		}
		this.doar = qtdDoacao;
	}
}


