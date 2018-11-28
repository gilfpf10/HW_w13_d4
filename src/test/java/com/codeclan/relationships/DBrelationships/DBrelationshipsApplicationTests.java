package com.codeclan.relationships.DBrelationships;

import com.codeclan.relationships.DBrelationships.Models.File;
import com.codeclan.relationships.DBrelationships.Models.Folder;
import com.codeclan.relationships.DBrelationships.Models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DBrelationshipsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testClasses(){
		User user = new User("Joe");
		Folder folder = new Folder ("MyFolder", user);
		File file = new File("File1", "txt", 10, folder );
	}

}
