package ejercicio2;

public class ejercicio2main {

	public static void main(String[] args) {

		contraseñasejercicio2 contraseña1 = new contraseñasejercicio2();
		
		contraseñasejercicio2 contraseña2 = new contraseñasejercicio2(16);
		
		System.out.println(contraseña1.getContraseña());
		
		System.out.println(contraseña2.getContraseña());

	}

}
