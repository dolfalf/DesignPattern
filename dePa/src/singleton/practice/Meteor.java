package singleton.practice;

public class Meteor implements Medal {

	private static Meteor meteor = new Meteor();
	
	private Meteor(){
		
	}
	
	public static Meteor getInstance(){
		return meteor;
	}
	
  @Override
  public void value() {
	  System.out.println("このメダルの価値は数えられません。");
  }
}
