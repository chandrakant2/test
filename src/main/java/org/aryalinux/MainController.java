package org.aryalinux;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/hello")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
	}
}
