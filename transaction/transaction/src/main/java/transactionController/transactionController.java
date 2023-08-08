package transactionController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import transaction.transaction;
import transactionService.transactionService;

@RestController
public class transactionController {
	@Autowired
	transactionService service;
	@GetMapping("/allrecord")
	List<transaction> getAllRecord() {
		List<transaction> t=service.getAllRecord();
		return t;
	}
	@PostMapping("/add" )
	boolean insertData(@RequestBody transaction t) {
		boolean b=service.insertData( t);
		return b;
		
	}
	@DeleteMapping("/delete/{id}")
	boolean deleteData(@PathVariable int id ) {
		boolean b=service.deleteData(id);
		return b;
	}
	@RequestMapping("/update")
	void updateData(@RequestBody transaction t) {
		service.updateData(t);
		
	}
	
	
}
