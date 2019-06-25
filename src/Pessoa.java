public abstract class Pessoa {
	private String nome;
	private String datNasc;
	private String sexo;
	private String estadocivil;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDatNasc() {
		return datNasc;
	}

	public void setDatNasc(String datNasc) {
		this.datNasc = datNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public abstract void doarSangue() throws Exception;

}
