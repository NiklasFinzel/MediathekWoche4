package mediathek.medien;


public class PCVideospiel extends AbstractVideospiel {

	public PCVideospiel(String titel, String kommentar, String system) {
		super(titel, kommentar, system);
	}

	@Override
	protected int getPreisNachTagen(int tage) {
		if(tage>7){
			tage-=7;
			int i=0;
			while(tage>0){
				i++;
				tage-=5;
			}
			return 500*i;
		}
		return 0;
	}
	

}
