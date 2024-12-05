package ua.edu.ucu.apps.task1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.FACEBOOK;
        User user = null;
        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("khita.pn@ucu.edu.ua", "Ukraine",
                    LocalDateTime.now().toString());
                user = new FacebookUserAdapter(facebookUser);

            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("khita.pn@ucu.edu.ua", "Ukraine",
                    LocalDateTime.now().toString());
                user = new TwitterUserAdapter(twitterUser);
                
            default:
                break;
        }
        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello!");
    }
}
