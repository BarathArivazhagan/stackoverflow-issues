package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {
	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	private final SimpMessagingTemplate msgTemplate;
	  
    
	
	public Application(SimpMessagingTemplate msgTemplate) {
		this.msgTemplate=msgTemplate;
		
	}
	
	@GetMapping(value="/home")
	public String home() {
		return "hello";
	}
			
	@RequestMapping(value = "/send-data", method = RequestMethod.POST)
	public String sendData(@RequestHeader(value = "id") String id,
            @RequestHeader(value = "data") String data) {
		
		if(logger.isInfoEnabled()) {
			logger.info("sending data to destination");
		}
		
		msgTemplate.convertAndSend("/topic/data-received", "data sent!!");
		return "successful";
	}

}

