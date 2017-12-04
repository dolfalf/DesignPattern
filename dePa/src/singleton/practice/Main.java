package singleton.practice;

public class Main {
	public static void main(String[] args){
		Normal n1 = new Normal();
		n1.value();
		
		Normal n2 = new Normal();
		n2.value();
		
		if(n1==n2){
			System.out.println("n1とn2は同じインスタンス"); 
		}
		
		Meteor m = Meteor.getInstance();
		m.value();
	}
}
