package streak.is.awesome.mail;

import android.util.Log;

/**
 * Created by sultankhan on 10/14/15.
 */
public class MailRecyclerInfo {

    String sender;
    String subject;
    String body;

    public MailRecyclerInfo() {
        super();

    }

    public MailRecyclerInfo(String sender, String subject, String body) {
        super();
        this.sender = sender;
        this.subject = subject;
        this.body = body;



    }

    public String getSender(){
        return sender;
    }
    public String getSubject(){
        return subject;
    }
    public String getBody(){
        return body;
    }

}
