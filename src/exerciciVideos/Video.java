package exerciciVideos;

import java.util.*;

public class Video {
	// video 

	private String videoUrl;
	private String videoTitle;
	
	private List<String> tagList = new ArrayList<String>();
	
	//Constructor 
	
	public Video(String url, String title, List<String> tags) {

		this.videoUrl = url;
		this.videoTitle = title;
		this.tagList = tags;

	}
	

	// GETTERS 

	public String getVideoUrl() {
		return videoUrl;
	}
	public String getVideoTitle() {
		return videoTitle;
	}
	public List<String> getTagList() {
		return tagList;
	}
	// SETTERS
	
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	
	
}