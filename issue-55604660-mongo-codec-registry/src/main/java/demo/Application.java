package demo;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.bson.BSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.BasicDBObjectBuilder;

@SpringBootApplication
public class Application {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
		
		@PostConstruct
		public void init() {
			
			Hobbies hobbies1= new Hobbies("TEST", "TEST");
			Hobbies hobbies2= new Hobbies("TEST", "TEST");
			Hobbies hobbies3= new Hobbies("TEST", "TEST");
			BSONObject personBsonObj = BasicDBObjectBuilder.start()
	                .add("firstName","John")
	                .add("lastName", null)
	                .add("email","john.kerr@gmail.com")
	                .add("hobbies",Arrays.asList(hobbies1,hobbies2,hobbies3)).get();

	        
			this.mongoTemplate.insert(personBsonObj,"person");
		}
		

	
}

@Document
class Person {
	
		@Id
	    private String id;
	    @Field
	    private String firstName;
	    @Field
	    private String lastName;

	    @Field
	    private String emailId;
	    @Field
	    private List<Hobbies> hobbies;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public List<Hobbies> getHobbies() {
			return hobbies;
		}
		public void setHobbies(List<Hobbies> hobbies) {
			this.hobbies = hobbies;
		}
		public Person(String id, String firstName, String lastName, String emailId, List<Hobbies> hobbies) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.hobbies = hobbies;
		}
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
	    

}

 class Hobbies {

	private String interest;

    private String sports;

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public Hobbies(String interest, String sports) {
		super();
		this.interest = interest;
		this.sports = sports;
	}

	public Hobbies() {
		super();
		// TODO Auto-generated constructor stub
	}


}



