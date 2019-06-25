
public class Paciente extends Pessoa {
	private String tiposangue;
	private int codPac;
	private String doar;

	public String getDoar() {
		return doar;
	}

	public void setDoar(String doar) {
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

	public void doarSangue() {
		this.doar = this.doar + tiposangue;
	}

}
