package exerciciVideos;


import java.util.*;

public class Usuari {

	//Usuari: format per un nom, cognom, password i una data de registre. 
	
	  private String userName;
	  private String userLastName;
	  private String userPassword;
	  private Date registerDate = getRegisterDate(); // Pildoras informaticas video 34
	  private List<Video> videoList = new ArrayList<Video>();
	
	  
	//Constructor
	
	public Usuari(String name, String lastName, String password) {
		
			
		
		
		
		this.userName = name;
		this.userLastName = lastName;
		this.userPassword= password;

		GregorianCalendar userRegisterDate = new GregorianCalendar();
		registerDate = userRegisterDate.getTime();
		
		
		
	} 
	
	
	
	
	


	//crea el llistat de videos sense espais buits
	
	public  Video createVideo(String url, String title, List<String> tagList) throws Exception {

		Video video = new Video(url, title, tagList); 

		

		if (url.isEmpty() && title.isEmpty()) {

			throw new Exception("Has de omplir tots els camps.");

		}




		System.out.println("Has creat un video amb titol " + video.getVideoTitle() + " amb els tags " + video.getTagList() + 

				" i amb la url: "+ video.getVideoUrl());

		

		this.videoList.add(video); 

		return video;

		

	}




	// per veure el llistat dels videos

	

	public void printVideoList() {

		System.out.println("El teu llistat de videos: ");

		for (Video v : this.videoList) { 

		System.out.println("Titol: " + v.getVideoTitle() + "| URL: " + v.getVideoUrl() + " | Lista de tags: "+ v.getTagList());

		}

		

	}


	
	
	
	//GETTERS 
	public String getUserName() {
		return userName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public Date getRegisterDate() {
		return registerDate;
	} 
	//SETTERS
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	

}