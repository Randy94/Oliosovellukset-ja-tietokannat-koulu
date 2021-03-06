package model;

import java.util.ArrayList;

public class Valuuttakone implements IValuuttakone {

	private ArrayList<Valuutta> valuutat = new ArrayList<>();
	
	
	
	public Valuuttakone() {
		valuutat.add(new Valuutta("Euroopan euro",1.0));
		valuutat.add(new Valuutta("Ruotsin kruunu",9.4780));
		valuutat.add(new Valuutta("Norjan kruunu",8.9018));
		valuutat.add(new Valuutta("Yhdysvaltain dollari",1.0629));
		
	}
	
	@Override
	public String[] getVaihtoehdot() {
		String[] valuuttataulu = new String[valuutat.size()];
		
		for(int i = 0; i < valuutat.size(); i++) {
			valuuttataulu[i] = valuutat.get(i).getNimi();
			
		}
		return valuuttataulu;
	}

	@Override
	public double muunna(int mistäIndeksi, int mihinIndeksi, double määrä) {
		double tulos = määrä/(valuutat.get(mistäIndeksi).getVaihtokurssi());
		
		tulos *= valuutat.get(mihinIndeksi).getVaihtokurssi();
		
		return tulos;
	}

}
