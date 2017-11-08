import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelloWorld {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.println("Please enter your name: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userName = br.readLine();
        HelloUser test = new HelloUser(userName);
        test.greetUser();
        
	}

}
