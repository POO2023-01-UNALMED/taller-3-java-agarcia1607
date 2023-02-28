package taller3.televisores;

public class tv {
	
	private int canal = 1;
	private int volumen = 1;
	private int precio = 500;
	private boolean estado;
	private Control control;
	private Marca marca;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado){
		this.setMarca(marca);
		this.estado = estado;
		setNumTV(getNumTV() + 1);
	}
	 // Encender o apagar el TV
	
	public void turnOn(){
		estado = true;
	}
	
	public void turnOff(){
		estado = false;
	}
	
	// Cambiar de canal
	
	public void canalUp(){
		setCanal(getCanal() + 1);
	}
	
	public void canalDown(){
		setCanal(getCanal() - 1);
	}
	
	// Subir o bajar el volumen
	
	public void volumenUp(){
		setVolumen(getVolumen() + 1);
	}
	
	public void volumenDown(){
		setVolumen(getVolumen() - 1);
	}
	
	//getters and setters
	
	public void setVolumen(int nuevoVolumen) {
		if (nuevoVolumen >= 0 && nuevoVolumen <= 7 && estado)
		{
			volumen = nuevoVolumen;
		}else {
			return;
		}
	}
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <= 120 && estado)
		{
			this.canal = canal;
		}else {
			return;
		}
	}

	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}

	public boolean getEstado() {
		return estado;
	}

	

}
