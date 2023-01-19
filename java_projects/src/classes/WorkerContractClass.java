package classes;

import java.util.Date;

public class WorkerContractClass {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public WorkerContractClass() {
	}
	
	public WorkerContractClass(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHour() {
		return hours;
	}

	public void setHour(Integer hour) {
		this.hours = hour;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
}
