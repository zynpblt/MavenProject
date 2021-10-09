package day05;

import org.junit.Test;

public class C01_Notasyon {

    //javadaki gibi seleniumda da belirli islecleri yapan methodlar olusturabiliriz
    //ancak bu methodlar cagrilmadikca calismazlar

    public void ilkTestMethodu(){
        System.out.println("Ilk test methodumuz");
    }
    //JUnit ile notasyon kullanarak siradan methodlari test methoduna donusturebiliriz
    //Bir test methodu bagimsiz olarak calisabilen test yapmamaiza imkan verir
    //@Test notasyonu sayesinde main method mecburiyeti ortadan kalkar
    @Test
    public void notasyonluIlkTestMethodu(){
        System.out.println(" Notasyonlu Ilk test methodumuz");
    }

}
