package exerciciVideos;

import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		
		System.out.println("Introdueix el teu nom: ");
		String userName = sc.nextLine();
		System.out.println("Introdueix el teu cognom: ");
		String userLastName = sc.nextLine();
		System.out.println("Introdueix el password: ");
		String userPassword = sc.nextLine();
		
		
	
		Usuari usuari = new Usuari (userName,userLastName,userPassword);
		
		
		if (userName.isEmpty() && userLastName.isEmpty() && userPassword.isEmpty()) {

			throw new Exception("Has d'omplir tots els camps.");

		}

		System.out.println(  usuari +" " +userLastName +" "+ "el teu password  es: "+ userPassword +" la teva data de registre es: " + usuari.getRegisterDate());

		while (true) {
			
			String input = sc.nextLine();
			
			System.out.println("¿Vols crear un video o veure el llistat dels teus videos? " + "\n"
					+ "Introdueix '1' si vols crear un video , '2' per veure un llistat dels teus videos, '3'Per a sortir del programa: ");
			

			switch (input) {

			case "1":

				do {

					System.out.println("Introdueix la URL: ");
					String url = sc.nextLine();
					System.out.println("Introdueix el títol: ");
					String title = sc.nextLine();
					System.out.println("Introdueix els tags, separats amb comas: ");
					String tagInput = sc.nextLine();
					List<String> tagList = Arrays.asList(tagInput.split("\\s*,\\s*"));
					usuari.createVideo(url, title, tagList);
					System.out.println("¿Vols agregar un altre video? deus contestar 'si' o 'no'");
					input = sc.nextLine();

				} while (input.equals("si"));

				break;

			case "2":
				usuari.printVideoList();

				break;

			case "3":
				System.out.println("has tancat sesió");
				System.exit(0);
				break;

			}

		}

	}

}