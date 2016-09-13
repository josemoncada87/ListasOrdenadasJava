import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;

public class MainApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main("MainApp");
	}

	@Override
	public void settings() {
		size(800, 600);
	}

	ArrayList<Circulo> circulos;
	
	@Override
	public void setup() {
		circulos = new ArrayList<>();
		circulos.add(new Circulo(10, 100, height / 2, "aa1z"));
		circulos.add(new Circulo(50, 200, height / 2, "aaa"));
		circulos.add(new Circulo(5, 300, height / 2, "2w"));
		circulos.add(new Circulo(20, 400, height / 2, "h"));
		circulos.add(new Circulo(15, 500, height / 2, "4t"));
		circulos.add(new Circulo(25, 600, height / 2, "u"));
		
	}

	@Override
	public void draw() {
		background(255);
		for (int j = 0; j < circulos.size(); j++) {
			circulos.get(j).pintar(this, 20 + (j * 50), height / 2);
		}

	}

	@Override
	public void keyPressed() {
		switch (key) {
		case '1':
			Collections.sort(circulos);
			break;
		case '2':
			Collections.sort(circulos, new ComparadorColorRojo());
			break;
		case '3':
			Collections.sort(circulos, new ComparadorLexicografico());
			break;

		default:
			break;
		}
	}

}
