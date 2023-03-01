 

public class DownloadInfo
   {
   private String title;  
   private int timesDownloaded;
      
   public DownloadInfo(String initialTitle)
      {
      title = initialTitle;
      timesDownloaded = 1;
      } 
   
   public DownloadInfo( String initialTitle, int initialTimesDownloaded )
      {
      title = initialTitle;
      timesDownloaded = initialTimesDownloaded;
      } 
      
   public String getTitle()
      {
      return title;    
      } 
      
   public void incrementTimesDownloaded()
      {
      timesDownloaded++;    
      } 
      
   public String toString()
      {
      String info = new String( "" );
      info = "Title: " + title + "\n" + "Number of times downloaded: " + timesDownloaded + "\n\n";
      
      return info;
      } 
   } 