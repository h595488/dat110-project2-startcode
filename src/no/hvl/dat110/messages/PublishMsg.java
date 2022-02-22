package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 
	private String message;
	private String topic;

	public PublishMsg(String message, String topic, String user) {
		super(MessageType.PUBLISH, user);

		this.topic = topic;
		this.message = message;

	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getMessage() {
		return this.message;
	}

	public String toString() {
		return "Message [type=" + this.getType() + ", user=" + this.getUser()
				+ ", topic=" + topic + "]";
}
}
