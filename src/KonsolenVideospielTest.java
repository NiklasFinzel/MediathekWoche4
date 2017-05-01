import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 */
public class KonsolenVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private KonsolenVideospiel _konsolenVideoSpiel;

    @Before
    public void setUp()
    {
        _konsolenVideoSpiel = getMedium();
    }

    @Test
    public void testeKonstruktoren()
    {
        assertEquals(TITEL, _konsolenVideoSpiel.getTitel());
        assertEquals(KOMMENTAR, _konsolenVideoSpiel.getKommentar());
        assertEquals(SYSTEM, _konsolenVideoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String videospielBezeichnung = BEZEICHNUNG;
        assertEquals(videospielBezeichnung, _konsolenVideoSpiel.getMedienBezeichnung());
    }

    protected KonsolenVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        KonsolenVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        KonsolenVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }
    
    @Test
    public final void testMiettage()
    {
    	assertEquals(_konsolenVideoSpiel.berechneMietgebuehr(1),new Geldbetrag(200));
    	assertEquals(_konsolenVideoSpiel.berechneMietgebuehr(2),new Geldbetrag(200));
    	assertEquals(_konsolenVideoSpiel.berechneMietgebuehr(3),new Geldbetrag(900));
    	assertEquals(_konsolenVideoSpiel.berechneMietgebuehr(6),new Geldbetrag(1600));
    }
    

}
