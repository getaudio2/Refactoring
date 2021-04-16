package refactoring;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.crypto.Data;

public class Lloguer {
	private Date data;
	private int dies;
	private Vehicle vehicle;
	
	public Date getData() {
		return data;
	}
	public Lloguer(Date data, int dies, Vehicle vehicle) {
		this.data = data;
		this.dies = dies;
		this.vehicle = vehicle;
	}
	public int getDies() {
		return dies;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
}
