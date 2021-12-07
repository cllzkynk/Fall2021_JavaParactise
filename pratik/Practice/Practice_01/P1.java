package Practice.Practice_01;

public class P1 {
	/*
	 * \n (or \r): starts from a new line : metni bir alt satirdan itibaren
	 * yazdirir.
	 * \t: horizontal tab : metni yatayda 1 tab miktari kaydirir.
	 * \\: prints a back slash :\ (ters slash) yazdirir \': prints single quote :' tek
	 * tirnak yazdirir. \": prints double quote :"" cift tirnak yazdirir.
	 * 
	 */

	public static void main(String[] args) {
		// Soru-1 : konsola
		// "Hello ", "World \ /"
		// seklinde yazdiriniz

		System.out.println("\"Hello \", \"Word \\ / \"");

		// Soru-2 : isminizin her harfini ayri bir satira gelecek sekilde yazdiriniz.

		System.out.println("h\na\nl\nu\nk");

		// Soru-3 : "Java" ile hayat cok 'afilli' yazdiriniz.

		System.out.println(" \"java\" ile hayat cok \'afilli\'");

		// Soru-4 : "Basari" gayrete
		// 'asiktir'
		// yazdiriniz. sonraki "TechProEd ile java cok kolay ..."
		// ifadesi 3 satir
		// sonra ve satir basindan 1 tab ilerideyazilsin.

		System.out.println("\"Basari\" gayrete \n\'asiktir\'");

		System.out.println("\n\n\n");
		System.out.println("\tTechProED ile java cok kolay");

	}

}