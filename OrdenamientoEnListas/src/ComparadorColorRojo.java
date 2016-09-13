import java.util.Comparator;

public class ComparadorColorRojo implements Comparator<Circulo>{

	@Override
	public int compare(Circulo o1, Circulo o2) {		
		return o1.getRojo()-o2.getRojo();
	}
	
}
