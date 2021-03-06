package entities;

public class Salesman {
	
	private Long cpf;
	private String name;
	private Double salary;
	
	public Salesman() {
		
	}

	public Salesman(Long cpf, String name, Double salary) {
		this.cpf = cpf;
		this.name = name;
		this.salary = salary;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
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

	@Override
	public String toString() {
		return "Salesman [cpf=" + cpf + ", name=" + name + ", salary=" + salary + "]";
	}
}
