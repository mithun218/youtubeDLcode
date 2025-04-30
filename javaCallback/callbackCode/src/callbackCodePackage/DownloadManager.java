package callbackCodePackage;

public class DownloadManager {
    void downloadFile(Callback callback) {
         System.out.println("Downloading file...");
         // After successful download return the following message
         callback.notifyUser("File downloaded successfully!");
         System.out.println("Callback returned!");
     }
 }
