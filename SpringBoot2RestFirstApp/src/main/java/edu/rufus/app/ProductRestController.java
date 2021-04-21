package edu.rufus.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@GetMapping("/all")
	public ResponseEntity<String> getAllProducts(){
		ResponseEntity<String> resp = new ResponseEntity<String>("FROM ALL", HttpStatus.OK);
		return resp;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(){
		ResponseEntity<String> resp = new ResponseEntity<String>("FROM SAVE", HttpStatus.CREATED);
		return resp;
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> modifyProduct(){
		ResponseEntity<String> resp = new ResponseEntity<String>("FROM UPDATE", HttpStatus.RESET_CONTENT);
		return resp;
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeProduct(){
		ResponseEntity<String> resp = new ResponseEntity<String>("FROM DELETE", HttpStatus.OK);
		return resp;
	}
}
