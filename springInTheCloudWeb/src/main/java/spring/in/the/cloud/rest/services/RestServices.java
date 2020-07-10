package spring.in.the.cloud.rest.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServices {
	
    @RequestMapping(value = "/hello_world", method = RequestMethod.GET)
    public ResponseEntity<String> userSession() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}