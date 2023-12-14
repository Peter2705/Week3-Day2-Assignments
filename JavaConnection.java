package week3.day2.assignment;

public class JavaConnection extends MySqlConnection {
	
	public void connect() {
		System.out.println("Connect");
	}

	
	public void disconnect() {
		System.out.println("Disconnect");
	}

	public void executeUpdate() {
		System.out.println("Execute update");
	}
	
	@Override
	public void finishQuery() {
		System.out.println("Finish Query");
	}
	
	public static void main(String[] args) {
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		JC.executeQuery();
		JC.finishQuery();
	}




}
