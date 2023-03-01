 

import java.util.List;
import java.util.ArrayList;

public class MusicDownloads
   {
   private List<DownloadInfo> downloadList;
   
   public MusicDownloads()
      {
      downloadList = new ArrayList<DownloadInfo>();
      downloadList.add( new DownloadInfo( "Hey Jude", 5 ) );
      downloadList.add( new DownloadInfo( "Soul Sister", 3 ) );
      downloadList.add( new DownloadInfo( "Aqualung", 10 ) );
      } 
      
   public DownloadInfo getDownloadInfo( String title )
      {
       for(DownloadInfo currentSong: downloadList)
       {
           if(currentSong.getTitle().equals( title))
           {
               return currentSong;
           }
       }
       return null;
      } 
      
   public void updateDownloads( List<String> titles )
      {
          
          /*for( int i =0; i<titles.size(); i++)
          {
              if(titles.get(i).equals(downloadList.get(2).getTitle()))
              {
                  downloadList.get(2).incrementTimesDownloaded();
              }
              else if(titles.get(i).equals(downloadList.get(0).getTitle()))
              {
                  downloadList.get(0).incrementTimesDownloaded();
              }
              else if(titles.get(i).equals(downloadList.get(1).getTitle()))
              {
                  downloadList.get(1).incrementTimesDownloaded();
              }
              else
              {
                  downloadList.add(new DownloadInfo(titles.get(i), 1));
              }
          }*/
          for(String currentTitle: titles)
          {
              DownloadInfo newInfo = getDownloadInfo(currentTitle);
              if(newInfo == null)
              {
                  downloadList.add(new DownloadInfo(currentTitle));
              }
              else
              {
                  newInfo.incrementTimesDownloaded();
              }
          }
          
          

      } 
      
   public String toString()
      {
      String musicDownloads = new String( "" );
      
      for( DownloadInfo item : downloadList )
         {
         musicDownloads = musicDownloads + item;    
         } 
         
      return musicDownloads;
      } 
   } 