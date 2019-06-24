
public class Paciente extends Pessoa {
	private String tiposangue;
	private int codPac;

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
		System.out.println("O nome: " + getNome());
		System.out.println("Data de Nascimento: " + getDatNasc());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Estado Civil: " + getEstadocivil());
	}

}
