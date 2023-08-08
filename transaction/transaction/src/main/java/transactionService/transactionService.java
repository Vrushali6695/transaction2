package transactionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import transaction.transaction;
import transactionDao.transactionDao;

@Service
public class transactionService {
	@Autowired
	transactionDao dao;
	public List<transaction> getAllRecord() {
		List<transaction> t =dao.getAllRecord();
		return t;
	}
	
	public boolean insertData(@RequestBody transaction t) {
		boolean b=dao.insertData(t);
		return b;
	}

	public boolean deleteData(int id) {
		boolean b=dao. deleteData(id);
		return b;
	}

	public void updateData(transaction t) {
		dao.updateData(t);
		
	}
}
