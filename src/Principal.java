
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		p1.setNome("José");
		p1.setDatNasc(12 / 01 / 1990);
		p1.setSexo("Masculino");
		p1.setEstadocivil("Casado");
		p1.setTiposangue("A+");
		p1.setCodPac(1);

		Paciente p2 = new Paciente();
		p2.setNome("Maria");
		p2.setDatNasc(15 / 02 / 1977);
		p2.setSexo("Feminino");
		p1.setEstadocivil("Solteiro");
		p2.setTiposangue("B+");
		p1.setCodPac(2);

		Paciente p3 = new Paciente();
		p3.setNome("Jhonatan");
		p3.setDatNasc(14 / 03 / 1999);
		p3.setSexo("Masculino");
		p3.setEstadocivil("Casado");
		p3.setTiposangue("O+");
		p3.setCodPac(3);

		System.out.println("**********SISTEMA HEMOCE**********");
		System.err.println();

		p1.mostrarPaciente();
		System.out.println();
		p2.mostrarPaciente();
		System.out.println();
		p3.mostrarPaciente();

	}

}
