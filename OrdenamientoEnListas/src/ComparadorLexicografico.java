import java.util.Comparator;

public class ComparadorLexicografico implements Comparator<Circulo>{

	@Override
	public int compare(Circulo o1, Circulo o2) {		
		return o1.getLetra().compareTo(o2.getLetra());
	}
	
	

}
