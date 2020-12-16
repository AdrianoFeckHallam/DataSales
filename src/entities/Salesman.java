package entities;

public class Salesman {
	
	private Integer cpf;
	private String name;
	private Double salary;
	
	public Salesman() {
		
	}

	public Salesman(Integer cpf, String name, Double salary) {
		this.cpf = cpf;
		this.name = name;
		this.salary = salary;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
