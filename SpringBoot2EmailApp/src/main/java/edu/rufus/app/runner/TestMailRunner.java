package edu.rufus.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import edu.rufus.app.util.EmailUtil;

@Component
public class TestMailRunner implements CommandLineRunner {

	@Autowired
	private EmailUtil emailUtil;
	
	@Override
	public void run(String... args) throws Exception {
		Resource file = new ClassPathResource("Certificate.jpg");
		boolean flag = emailUtil.send("rajatgauri21@gmail.com", null, null, "Sample Mail", "<html><body><h1>This is a Test Mail!</h1></body></html>", file);
		if(flag == true) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
	}

}
