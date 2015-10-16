package streak.is.awesome.pipeline;

/**
 * Created by sultankhan on 10/15/15.
 */
public class PipelineRecyclerInfo {
    String sender;
    String subject;
    String body;

    public PipelineRecyclerInfo() {
        super();

    }

    public PipelineRecyclerInfo(String sender, String subject, String body) {
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
