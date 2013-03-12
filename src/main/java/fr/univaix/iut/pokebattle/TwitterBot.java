package fr.univaix.iut.pokebattle;

import com.twitter.hbc.httpclient.ControlStreamException;
import fr.univaix.iut.pokebattle.tuse.TwitterUserStreamEasy;
import fr.univaix.iut.pokebattle.tuse.UserStreamAdapter;
import twitter4j.*;

import java.io.IOException;

public class TwitterBot {

    TwitterUserStreamEasy twitterUserStreamEasy;

    public TwitterBot(final Bot bot) {
        UserStreamListener listener = new UserStreamAdapter() {

            Twitter twitter = TwitterFactory.getSingleton();

            @Override
            public void onStatus(Status status) {
                try {
                    System.out.println("TwitterUserStreamEasyExample.onStatus");
                    String response = bot.ask(status.getText());
                    System.out.println(response);
                    if (response != null)
                        twitter.updateStatus(response);
                } catch (TwitterException e) {
                    e.printStackTrace();
                }
            }
        };

        twitterUserStreamEasy = new TwitterUserStreamEasy(listener);
    }

    public void startBot() throws InterruptedException, ControlStreamException, IOException {
        twitterUserStreamEasy.oauth();
    }

    public static void main(String[] args) {

        try {
            TwitterBot twitterBot = new TwitterBot(new PokeBot());
            twitterBot.startBot();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ControlStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
