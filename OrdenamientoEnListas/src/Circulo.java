import processing.core.PApplet;

public class Circulo implements Comparable<Circulo>{
	
	private float radio;
	private int x, y;
	private int rojo;
	private String letra;
	
	
	public Circulo(float radio, int x, int y, String letra) {
		this.radio =  radio;
		this.x = x;
		this.y = y;
		this.rojo = (int) (Math.random()*255);
		this.letra = letra;
	}
	
	public int getRojo() {
		return rojo;
	}
	
	public String getLetra() {
		return letra;
	}
	
	public void pintar(PApplet app, int x, int y) {
		this.x = x;
		this.y = y;
		app.fill(rojo, 0, 0);
		app.ellipse(x, y, radio*2, radio*2);
		app.fill(0);
		app.text(letra, x, y+100);
	}

	@Override
	public int compareTo(Circulo o) {	
		return (int) (radio-o.radio);
	}
	
	@Override
	public String toString() {	
		return "circulo de radio: " + radio;
	}

}

