package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV televisor) {
		tv = televisor;
		televisor.setControl(this);
	}
	
	public void turnOn(){
		this.tv.turnOn();
	}
	
	public void turnOff(){
		this.tv.turnOff();
	}
	
	public void canalUp(){
		this.tv.canalUp();
	}
	
	public void canalDown(){
		this.tv.canalDown();
	}
	
	public void volumenUp(){
		this.tv.volumenUp();
	}
	
	public void volumenDown(){
		this.tv.volumenDown();
	}
	
	public void setCanal(int nuevoCanal) {
		this.tv.setCanal(nuevoCanal);
	}
	
	public void setTv (TV televisor) {
		tv = televisor;
	}
	
	public TV getTv () {
		return tv;
	}
}
