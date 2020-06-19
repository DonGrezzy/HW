//Welchen Geltungsbereich (Scope) haben Variablen?

public class Scoping {
	public int a = 1;//1. Felder gelten in der ganzen Klasse
//	public String a = "1";//Feldnamen müssen eindeutig sein :)
	
	public Scoping(int a) {//Ein Übergabeparameter kann den selben Namen haben
		System.out.println(a);//Hier wird jetzt 2 ausgegeben, weil Zeile 14
//		int a = 3;//Variablennamen müssen eindeutig sein
	}
	
	public Scoping() {
		int a = 4;//auch wieder eine lokale Variable
		System.out.println(a);
	}
	
	public void asetzen() {
		int a = 5;//Auch in Methoden kann ich lokale Variablen setzen
		System.out.println(a);
		
		System.out.println("Feld:" + this.a);//Das Feld ist immer noch 1
	}
	//Innerhalb der Konstruktoren und Methoden können lokale Variablen
	//mit dem gleichen Namen existieren, die das Feld "überdecken"
	//Um explizit auf das Feld zuzugreifen muss ich dann this.a machen:
	
	public void asetzen(int a) {
		this.a = a;
		System.out.println("Feld:" + this.a);//Das Feld ist nicht mehr 1
	}
	//Wenn ich keine lokale Variable mit dem gleichen Namen habe
	//brauche ich kein this, sondern kann sofort mit dem Feldnamen zugreifen
	public int alesen() {
		System.out.println(a);
		return a;
	}
	
	//Scoping innerhalb von Methoden
	public void loop() {
		//Hier erzeuge ich eine lokale Variable:
		for(int a=0;a<3;a++) {
			System.out.println(a);//Hier wird der Wert des zaehlers ausgegeben
		}
		System.out.println(a);
		//hier der Wert des Feldes(der zaehler existiert hier nicht mehr)
		
		//Eine ganz andere lokale Variable a
		for(int a=0;a<5;a++) {
			System.out.println(a);//Hier wird der Wert des zaehlers ausgegeben
		}
		//Diese lokalen Variablen existieren nur innerhalb ihrer eigenen
		//geschweiften Klammern (also der for-Schleife)
		
		//Ich darf auch einfach so Blöcke definieren
		{
			int a =7;
			System.out.println(a);
		}
		//mit ihrem eigenen Scope, dieses a existiert nur in dem Block
		
		
		//Und zuletzt eine lokale Variable für die Methode
		int a = 6;
		//ab jetzt kann ich a nicht mehr als neuen Schleifenzaehler benutzen:
//		for(int a = 0; a < 7;) {
//			
//		}
		
		//aber natürlich so 
		for (a = 0; a < 7; a++) {
			System.out.println(a);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scoping scope = new Scoping(2);
		System.out.println(scope.a);
	}
}
