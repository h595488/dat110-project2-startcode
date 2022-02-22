package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	// Tror det er bare denne som må brukes?
	private String topic;
	
	// Constructor
	public CreateTopicMsg(String user, String topic) {
		super(MessageType.CREATETOPIC, user);
		this.topic = topic;
	}
	
	// Getter for topic
	public String getTopic() {
		return this.topic;
	}
	// Setter for topic
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
	// Tostring
	@Override
	public String toString() {
		return "Message [type=" + this.getType() + ", user=" + this.getUser() 
			+ ", topic=" + topic + "]";
	}
	
}
