package ejercicio2;

public class contraseñasejercicio2 {
	
	private int longitud;
	
	private String contraseña;
	
	final private String key = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public contraseñasejercicio2() {
	
		this.longitud = 8;
		
		this.contraseña = generador(key, this.longitud);
		
	}
	
	public contraseñasejercicio2(int longitud) {
	
		this.longitud = longitud;
		
		this.contraseña = generador(key, this.longitud);
		
	}
	
	private static String generador(String key, int longitud) {
	
		String pswd = "";
 
		for (int i = 0; i < longitud; i++) {
		
			pswd+=(key.charAt((int)(Math.random() * key.length())));
		
		}
 
		return pswd;
	
	}
		
	public int getLongitud() {
	
		return longitud;
	
	}

	public void setLongitud(int longitud) {

		this.longitud = longitud;
	
	}

	public String getContraseña() {
	
		return contraseña;

	}

}
