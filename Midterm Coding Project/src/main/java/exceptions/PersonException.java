package exceptions;

import com.cisc181.core.Person;

public class PersonException {

	private Person p;

	public PersonException(Person p) {
		super();
		this.p = p;
	}

	public Person getP() {
		return p;
	}
	
}

