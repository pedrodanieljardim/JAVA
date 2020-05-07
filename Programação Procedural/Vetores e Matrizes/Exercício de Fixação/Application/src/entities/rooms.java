package entities;

public class rooms {
	private String name;
	private String email;
	private int number_room;
	
	public rooms(String name, String email, int number_room){
		this.name = name;
		this.email = email;
		this.number_room = number_room;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber_room() {
		return number_room;
	}

	public void setNumber_room(int number_room) {
		this.number_room = number_room;
	}
	
	
	
}
