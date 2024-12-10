package section11;

public class Speaker {
	private String name;

	public Speaker(String name) {
		this.name = name + " 스피커";
	}

	public String getName() {
		return name;
	}
}

class RedSpeaker extends Speaker {
	public RedSpeaker() {
		super("빨간");
	}
}

class BlueSpeaker extends Speaker {
	public BlueSpeaker() {
		super("파란");
	}
}
