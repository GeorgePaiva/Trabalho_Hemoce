
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		p1.setNome("José");
		p1.setDatNasc("12/12/1988");
		p1.setSexo("Masculino");
		p1.setEstadocivil("Casado");
		p1.setTiposangue("A+");
		p1.setCodPac(1);

		p1.mostrarPaciente();
		p1.doarSangue();

		System.out.println("O sangue doado é: " + p1.getDoar());
		System.out.println();

		Paciente p2 = new Paciente();
		p2.setNome("Maria");
		p2.setDatNasc("12/10/1999");
		p2.setSexo("Feminino");
		p2.setEstadocivil("Solteiro");
		p2.setTiposangue("B+");
		p2.setCodPac(2);

		p2.mostrarPaciente();
		p2.doarSangue();

		System.out.println("O sangue doado é: " + p2.getDoar());
		System.out.println();

		Paciente p3 = new Paciente();
		p3.setNome("Jhonatan");
		p3.setDatNasc("01/01/1999");
		p3.setSexo("Masculino");
		p3.setEstadocivil("Casado");
		p3.setTiposangue("O+");
		p3.setCodPac(3);

		p3.mostrarPaciente();
		p3.doarSangue();

		System.out.println("O sangue doado é: " + p3.getDoar());
		System.out.println();

	}

}
