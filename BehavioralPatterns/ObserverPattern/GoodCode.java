// Observer interface

import java.util.ArrayList;
import java.util.List;

interface ChannelSubscriber {
  void update(String channelName, String title);
}

// Subject interface
interface Channel {
  void subscribe(ChannelSubscriber subscriber);

  void unsubscribe(ChannelSubscriber subscriber);

  void notifySubscribers(String title);
}

// Concrete Implementation
class EnhancedYouTubeChannel implements Channel {
  private String name;
  private List<ChannelSubscriber> subscribers = new ArrayList<>();

  public EnhancedYouTubeChannel(String name) {
    this.name = name;
  }

  @Override
  public void subscribe(ChannelSubscriber subscriber) {
    subscribers.add(subscriber);
  }

  @Override
  public void unsubscribe(ChannelSubscriber subscriber) {
    subscribers.remove(subscriber);
  }

  @Override
  public void notifySubscribers(String title) {
    for (ChannelSubscriber subscriber : subscribers) {
      subscriber.update(name, title);
    }
  }

  public void uploadVideo(String title) {
    System.out.println("Sending the notifications!");
    notifySubscribers(title);
  }
}

// Concrete Observer
class MobileSubscriber implements ChannelSubscriber {
  private String username;

  public MobileSubscriber(String username) {
    this.username = username;
  }

  public void update(String channelName, String title) {
    // Some logic to notify
    System.out.println("[MobileApp] " + username + ": New video frmo " + channelName + " : " + title);
  }
}

class EmailSubscriber implements ChannelSubscriber {
  private String emailId;

  public EmailSubscriber(String emailId) {
    this.emailId = emailId;
  }

  public void update(String channelName, String title) {
    // Some logic to notify
    System.out.println("[Email] " + emailId + ": New video frmo " + channelName + " : " + title);
  }
}

public class GoodCode {
  public static void main(String[] args) {
    EnhancedYouTubeChannel channel = new EnhancedYouTubeChannel("TheLeanProgrammer");

    ChannelSubscriber mobileUser1 = new MobileSubscriber("Luffy");
    ChannelSubscriber mobileUser2 = new MobileSubscriber("Zoro");
    ChannelSubscriber emailUser1 = new EmailSubscriber("Sanji");
    ChannelSubscriber emailUser2 = new EmailSubscriber("Chopper");

    channel.subscribe(mobileUser1);
    channel.subscribe(mobileUser2);
    channel.subscribe(emailUser1);
    channel.subscribe(emailUser2);

    channel.uploadVideo("Learn Observer Pattern");

    channel.unsubscribe(emailUser1);

    channel.uploadVideo("OCP");
  }
}
