package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker
	private String topic;
	//Constructor
	public DeleteTopicMsg(String topic, String user) {
		super(MessageType.DELETETOPIC, user);
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


}
