import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 */
public class PCVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private PCVideospiel _pcVideoSpiel;

    @Before
    public void setUp()
    {
        _pcVideoSpiel = getMedium();
    }

    @Test
    public void testeKonstruktoren()
    {
        assertEquals(TITEL, _pcVideoSpiel.getTitel());
        assertEquals(KOMMENTAR, _pcVideoSpiel.getKommentar());
        assertEquals(SYSTEM, _pcVideoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String videospielBezeichnung = BEZEICHNUNG;
        assertEquals(videospielBezeichnung, _pcVideoSpiel.getMedienBezeichnung());
    }

    protected PCVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        PCVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        PCVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }
    
    @Test
    public final void testMiettage()
    {
    	assertEquals(_pcVideoSpiel.berechneMietgebuehr(1),new Geldbetrag(200));
    	assertEquals(_pcVideoSpiel.berechneMietgebuehr(7),new Geldbetrag(200));
    	assertEquals(_pcVideoSpiel.berechneMietgebuehr(8),new Geldbetrag(700));
    	assertEquals(_pcVideoSpiel.berechneMietgebuehr(12),new Geldbetrag(700));
    	assertEquals(_pcVideoSpiel.berechneMietgebuehr(13),new Geldbetrag(1200));
    }
    

}
