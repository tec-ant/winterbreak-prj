/*
Ciao sono Antonio Pepe, docente di informatica.
Se stai leggendo questo codice allora qualcosa ti ha incuriosito!
Continua a leggere e scoprirai tante cose interessanti...
*/
package pkg;

import pkg.model.Teacher;

public class App {
	public static void main(String[] args) {
		System.out.printf("Ciao, sono %s..\n", new Teacher("Antonio", "Pepe", "B016"));
	}
}