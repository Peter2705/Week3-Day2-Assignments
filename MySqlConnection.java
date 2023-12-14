package week3.day2.assignment;

public abstract class MySqlConnection implements DatabaseConnection {
	public void executeQuery() {
		System.out.println("Execute Query");
	}
	
	public abstract void finishQuery();
	

}
