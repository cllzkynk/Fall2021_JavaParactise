package Practice.Practice_13_Abstract02;

   /*
     *Sekil diye bir class olusturalim cevre ve alan abstract methodlari olsun

    -ucgen
    -eskenar
    -ikizkenar
    -cesitkenar
    -dikdortgen
    -daire

     herbirinin alan ve cevresini hesaplayan kodu yazin
     */

  public abstract class Sekil {
	// abstract class larda body olmaz.. 
	// abstract icinde concrete method yapabiliriz..
	// parametreli cons olmaz..

	  public abstract double cevre();
	  public abstract double alan();

}