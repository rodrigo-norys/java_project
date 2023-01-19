package classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import classes.enums.WorkerEnum;

public class WorkerClass {

	private String name;
	private WorkerEnum workerLevel;
	private Double baseSalary;
	
	// Como 1 trabalhador só pode fazer parte de 1 departamento, não precisaremos de uma lista
	private WorkerDepartmentClass department;
	// Aqui, 1 trabalhador pode ter mais de um contrato, logo precisará de uma lista
	private List<WorkerContractClass> contracts = new ArrayList<>();
	
	public WorkerClass() {		
	}

	public WorkerClass(String name, WorkerEnum workerLevel, Double baseSalary, WorkerDepartmentClass department) {
		this.name = name;
		this.workerLevel = workerLevel;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerEnum getWorkerLevel() {
		return workerLevel;
	}

	public void setWorkerLevel(WorkerEnum workerLevel) {
		this.workerLevel = workerLevel;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public WorkerDepartmentClass getDepartment() {
		return department;
	}

	public void setDepartment(WorkerDepartmentClass department) {
		this.department = department;
	}

	public List<WorkerContractClass> getContracts() {
		return contracts;
	}

	/** Por já existir os 2 métodos responsáveis por adicionar e remover contratos
	    É de SUMA IMPORTÂNCIA que o método SET da lista de contratos seja apagado.
	   	Deixar ele ativo, significará a existência de uma possível nova lista.
	
		public void setContracts(List<WorkerContractClass> contracts) {
			this.contracts = contracts;
	}
	*/

	public void addContract(WorkerContractClass contract) {
		contracts.add(contract);
	}
	
	public void removeContract(WorkerContractClass contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		
		// A variável sum irá receber o baseSalary
		double sum = baseSalary;
		
		
		Calendar incomeDate = Calendar.getInstance();
		
		for (WorkerContractClass itContract : contracts) {
			incomeDate.setTime(itContract.getDate());
			
			int itContract_year = incomeDate.get(Calendar.YEAR);
			int itContract_month = 1 + incomeDate.get(Calendar.MONTH);
			
			if (year == itContract_year && month == itContract_month) {
				sum += itContract.totalValue();
			}
		}
		return sum;
	}
}
