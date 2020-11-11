package Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SingleObject sb = SingleObject.getInstnce();
      sb.showMessage();
      
      SingleObject sb1 = SingleObject.getInstnce();
      sb1.showMessage();
      
	}

}
