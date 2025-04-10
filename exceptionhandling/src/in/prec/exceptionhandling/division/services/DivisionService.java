package in.prec.exceptionhandling.division.services;

import in.prec.exceptionhandling.division.exceptions.NameIsEmptyException;
import in.prec.exceptionhandling.division.repo.DivisionRepo;

public class DivisionService {
	private DivisionRepo repo = new DivisionRepo();
	public int division(int no1, int no2)throws NameIsEmptyException,Exception {
		return repo.division(no1,no2);
	}
}
