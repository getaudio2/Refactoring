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
	
	public double quantitat() {
		double quantitat = 0;
    	switch (this.getVehicle().getCategoria()) {
        	case Vehicle.BASIC:
            	quantitat += 3;
            	if (this.getDies() > 3) {
                	quantitat += (this.getDies() - 3) * 1.5;
            	}
            	break;
        	case Vehicle.GENERAL:
            	quantitat += 4;
            	if (this.getDies() > 2) {
                	quantitat += (this.getDies() - 2) * 2.5;
            	}
            	break;
        	case Vehicle.LUXE:
            	quantitat += this.getDies() * 6;
            	break;
    	}
    	return quantitat;
	}
}
