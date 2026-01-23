class EmailNotificationService {
  public void sendNewVideoNotification(String channelName, String title) {
    System.out.println("[Email] New video from " + channelName + " : " + title);
  }
}

class MobileNotificationService {
  public void sendNewVideoNotification(String channelName, String title) {
    System.out.println("[Android Toast] New video from " + channelName + " : " + title);
  }
}

class smsNotification {
  public void sendNewVideoNotification(String channelName, String title) {
    System.out.println("[SMS] New video from " + channelName + " : " + title);
  }
}

class YouTubeChannel {
  private String name;
  private EmailNotificationService emailNotificationService;
  private MobileNotificationService mobileNotificationService;

  public YouTubeChannel(String name, EmailNotificationService emailNotificationService,
      MobileNotificationService mobileNotificationService) {
    this.name = name;
    this.emailNotificationService = emailNotificationService;
    this.mobileNotificationService = mobileNotificationService;
  }

  public void uploadVideo(String title) {
    System.out.println("New video uploaded: " + title);

    // Let's individually send notifications to all our services
    emailNotificationService.sendNewVideoNotification(this.name, title);
    mobileNotificationService.sendNewVideoNotification(this.name, title);
  }
}

public class BadCode {
  public static void main(String[] args) {
    MobileNotificationService mobileService = new MobileNotificationService();
    EmailNotificationService emailService = new EmailNotificationService();

    // Create a new YT channel
    YouTubeChannel channel = new YouTubeChannel("TheLeanProgrammer", emailService, mobileService);

    channel.uploadVideo("LLD Course 1");
    channel.uploadVideo("Observer Pattern");
  }
}
