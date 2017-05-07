import java.io.FileWriter;
import java.io.IOException;

public class VerleihProtokollierer {
	/**
	 * Speichert in einem Textfile alle Ausleihen und Rueckgaben ab.
	 * 
	 * @require ereignis == "Ausleihe" || ereignis == "Rueckgabe"
	 * @require verleihkarte != null
	 * @param ereignis Gibt and ob es sich um eine Ausleihe oder Rueckgabe handelt
	 * @param verleihkarte Gibt an welche Verleihkarte protokolliert werden soll
	 */
	public static void protokolliere(String ereignis, Verleihkarte verleihkarte) throws ProtokollierException{
		assert ereignis.equals("Ausleihe") || ereignis.equals("Rueckgabe");
		assert verleihkarte != null;
		try(FileWriter writer = new FileWriter("./protokoll.txt",true))
		{
		if(ereignis.equals("Ausleihe")){

				writer.write(verleihkarte.getFormatiertenString());
			
		}
		else{

				writer.write(verleihkarte.getFormatiertenString() + "und Rücknahme am:" + Datum.heute() +"\n");

		}
		}
		catch(IOException e){
			throw new ProtokollierException(e.toString());
		}
	}

}
