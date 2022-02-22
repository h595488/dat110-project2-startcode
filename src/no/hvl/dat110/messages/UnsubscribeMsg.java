package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 
    private String topic;
    //Constructor
    public UnsubscribeMsg(String topic, String user) {
        super(MessageType.UNSUBSCRIBE, user);
        this.topic = topic;
    }
    //Getter
    public String getTopic() {
        return this.topic;
    }
    //Setter
    public void setTopic(String topic) {
        this.topic = topic;
    }
    //Tostring
    @Override
    public String toString() {
        return "Message [type=" + this.getType() + ", user=" + this.getUser()
                + ", topic=" + topic + "]";
    }
	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
}
