import lombok.Builder;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SendNotifications {

  public static void sendNotificationToUsers(List<User> users) {
    if (Objects.nonNull(users)) {
      for (User user : users) {
        if(user.getPreferredCommunication().equalsIgnoreCase("sms")) {
          if(Objects.nonNull(user.getPhoneNumber()))
            sendSmsNotification(user);
          else
            System.out.println("phone number not exist for " +user.getName());
        }
        else {
          if(Objects.nonNull(user.getEmail()))
            sendEmailNotification(user);
          else
            System.out.println("email not exist for " +user.getName());
        }
      }
    }
    else
      System.out.println("users list is empty");
  }

  private static void sendEmailNotification(User user) {
    System.out.println("sent email to  " +user.getName());
  }

  private static void sendSmsNotification(User user) {
    System.out.println("sent sms to " +user.getName());
  }

  @Data
  @Builder(setterPrefix = "set")
  public static class User {
    private String name;
    private String email;
    private Long phoneNumber;
    private String preferredCommunication;
  }

  public static void main(String[] args) {
    List<User> users  =new ArrayList<>();

    User user1 = User.builder().setName("user 1").setEmail(null).setPhoneNumber(1122334455L).setPreferredCommunication("sms").build();
    User user2 = User.builder().setName("user 2").setEmail("abcd@dummy.com").setPhoneNumber(null).setPreferredCommunication("email").build();
    User user3 = User.builder().setName("user 3").setEmail(null).setPhoneNumber(1122334455L).setPreferredCommunication("email").build();
    User user4 = User.builder().setName("user 4").setEmail("abcd@dummy.com").setPhoneNumber(null).setPreferredCommunication("sms").build();

    users.addAll(List.of(user1,user2,user3,user4));
    sendNotificationToUsers(users);
  }
}
