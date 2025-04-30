package callbackCodePackage;

class User implements Callback {
    public static void main(String[] args) {
        DownloadManager dm = new DownloadManager();
        User user = new User();
        dm.downloadFile(user);
    }

    @Override
    public void notifyUser(String message) {
        System.out.println(message);
    }
}
