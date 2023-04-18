package main;

public class validar {

	public Boolean validar(String cadena) {
		if(cadena.matches("[0-9]*") && cadena.length()==8) {
			return true;
	}
	else {
		return false;
}
}
}