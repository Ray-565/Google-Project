package com.google;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;


public class VideoPlayer {

  ArrayList<String> arr = new ArrayList<String>();
  ArrayList<String> list = new ArrayList<String>();

  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {

    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());

  }

  public void showAllVideos() {

    System.out.println("Here's a list of all available videos:");
    videoLibrary.showAll();

  }

  public void playVideo(String videoId) {
    Video video = videoLibrary.getVideo(videoId);
       if (video == null) {

         System.out.println("Cannot play video: Video does not exist");

       }
       else if (arr.size() > 0) {
      System.out.println("Stopping Video: " + arr.get(0));
      arr.remove(0);

      arr.add(videoLibrary.getVideo(videoId).getTitle());

    }else{
      arr.add(videoLibrary.getVideo(videoId).getTitle());
    }
    System.out.println("Playing video: " +
            videoLibrary.getVideo(videoId).getTitle());
  }

  public void stopVideo() {
    String videoId = videoLibrary.getVideos().get(0).getVideoId();
    Video video = videoLibrary.getVideo(videoId);
    if (video == null) {
      System.out.println("Cannot play video: Video does not exist");
    }
    else if (arr.size() > 0) {
      System.out.println("Stopping video: " + arr.get(0));
      arr.remove(0);
    }else{
      System.out.println("Cannot stop video: No video is currently playings");
    }
  }

  public void playRandomVideo() {
 /*   Random r = new Random();
    int randomVideoIndex = r.nextInt(videos.size());
    pause = false;

    System.out.println("playRandomVideo needs implementation");
  }
*/}
  public int count = 0;

  public void pauseVideo() {

    if ((arr.size()>0)&&(count>0))
    {
      System.out.println("Video already paused: " + arr.get(0));
      return;
    }
    if(arr.size()>0)
    {
      System.out.println("Pausing video: "+arr.get(0));
      count++;
      return;
    }
  }

  boolean flag = false;

  public void continueVideo() {

    if((count==0)&&(flag==false)) {
      System.out.println("Cannot continue video: Video is not paused");
    }
    else if((count>0)&&(flag==false))
    {
      System.out.println("Continue video: "+arr.get(0));
      flag = true;
    }
    else if((count>0)&&(flag==true))
    {
      System.out.println("Cannot continue video: Video is not paused");
    }
    else {
      System.out.println("Cannot continue video: No video is currently playing");
    }
  }

  public String getVideoString(Video video)
  {
    String tags=String.join(" ",video.getTags());
    return video.getTitle()+" ("+video.getVideoId()+") ["+tags+"]";
  }



  public void showPlaying() {
      System.out.println("No video is currently playing");
    }
/*    if(arr.size()>0)
    {
      List<Video>  videos= videoLibrary.getVideos();

      for(Video video: videos)
      {
        if(video.getTitle()==arr.get(0)) {
            System.out.print("Currently playing: ");

            System.out.println(getVideoString(video)+"/t");
        }
      }
    }
    else
    {
      System.out.println("No video is currently playing");
    }*/



  public void createPlaylist(String playlistName) {

  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}