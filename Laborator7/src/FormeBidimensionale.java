import java.util.ArrayList;
import java.util.List;


public class FormeBidimensionale implements FiguraGeometrica {
private List<FiguraGeometrica>figuriGeometrice=new ArrayList<FiguraGeometrica>();

@Override
public void afisareForma() {
	for(FiguraGeometrica fig:figuriGeometrice) {
		fig.afisareForma();
		}
	}

public void addFigura(FiguraGeometrica fig) {
	figuriGeometrice.add(fig);
}

public void removeFigura(FiguraGeometrica fig) {
	figuriGeometrice.remove(fig);
}


}
