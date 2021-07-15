package ejercicio2;

public class contrase�asejercicio2 {
	
	private int longitud;
	
	private String contrase�a;
	
	final private String key = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public contrase�asejercicio2() {
	
		this.longitud = 8;
		
		this.contrase�a = generador(key, this.longitud);
		
	}
	
	public contrase�asejercicio2(int longitud) {
	
		this.longitud = longitud;
		
		this.contrase�a = generador(key, this.longitud);
		
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

	public String getContrase�a() {
	
		return contrase�a;

	}

}
