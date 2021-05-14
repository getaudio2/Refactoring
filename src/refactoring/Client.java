package refactoring;

import java.util.Vector;

public class Client {
	private String nif;
    private String nom;
    private String telefon;
    private Vector<Lloguer> lloguers;
    private static final double EUROS_PER_UNITAT_DE_COST = 30;

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new Vector<Lloguer>();
    }

    public String getNif()     { return nif;     }
    public String getNom()     { return nom;     }
    public String getTelefon() { return telefon; }

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void afegeix(Lloguer lloguer) {
        if (! lloguers.contains(lloguer) ) {
            lloguers.add(lloguer);
        }
    }
    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer) ) {
            lloguers.remove(lloguer);
        }
    }
    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }

    //public String informe() {
        //double total = 0;
        //int bonificacions = 0;
        /*String resultat = "Informe de lloguers del client " +
            getNom() +
            " (" + getNif() + ")\n";*/
        //for (Lloguer lloguer: lloguers) {
        	
        	//bonificacions += lloguer.bonificacions();
        	
            /*String resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (lloguer.quantitat() * 30) + "€" + "\n";*/
            
            //total += lloguer.quantitat() * 30;
            
            /*double quantitat = 0;
        	switch (lloguer.getVehicle().getCategoria()) {
	        case Vehicle.BASIC:
	            quantitat += 3;
	            if (lloguer.getDies() > 3) {
	                quantitat += (lloguer.getDies() - 3) * 1.5;
	            }
	            break;
	        case Vehicle.GENERAL:
	            quantitat += 4;
	            if (lloguer.getDies() > 2) {
	                quantitat += (lloguer.getDies() - 2) * 2.5;
	            }
	            break;
	        case Vehicle.LUXE:
	            quantitat += lloguer.getDies() * 6;
	            break;
	    	}*/
        //}

        // afegeix informació final
        /*resultat += "Import a pagar: " + importeTotal() + "€\n" +
            "Punts guanyats: " + bonificacionsTotals() + "\n";
        return resultat;*/
    //}
    
    public String composaCapsalera() {
    	String resultat = "<h1>Informe de lloguers</h1>\n" + "<p>Informe de lloguers del client <em>" +
                getNom() +
                "</em> (<strong>" + getNif() + "</strong>)</p>\n";
    	return resultat;
    }
    
    public String composaDetall() {
    	String resultat = "<table>\n" + "<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>\n";
    	for (Lloguer lloguer: lloguers) {
    	resultat += "\t<tr><td>" +
                lloguer.getVehicle().getMarca() +
                "</td><td>" +
                lloguer.getVehicle().getModel() + "</td><td>" +
                (lloguer.quantitat() * EUROS_PER_UNITAT_DE_COST) + "€" + "</td></tr>\n";
    	}
    	resultat += "</table>\n";
    	return resultat;
    }
    
    public String composaPeu() {
    	String resultat = "<p>Import a pagar: <em>" + importeTotal() + "€</em></p>\n" +
                "<p>Punts guanyats: <em>" + bonificacionsTotals() + "</em></p>\n";
            return resultat;
    }
    
    public String informe() {
    	return composaCapsalera() +
    		   composaDetall() +
    		   composaPeu();
    }
    
    public double importeTotal() {
    	double total=0;
    	for (Lloguer lloguer: lloguers) {
    		total += lloguer.quantitat() * EUROS_PER_UNITAT_DE_COST;
    	}
    	return total;
    }
    
    public int bonificacionsTotals() {
    	int bonificacions = 0;
    	for (Lloguer lloguer: lloguers) {
    		bonificacions += lloguer.bonificacions();
    	}
    	return bonificacions;
    }
    
    /*public int bonificacionsDeLloguer(Lloguer lloguer) {
    	int bonificacions=0;
    	bonificacions ++;
        if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE &&
                lloguer.getDies()>1 ) {
            bonificacions ++;
        }
        return bonificacions;
    }*/
    
	/*public double quantitatPerLloguer(Lloguer lloguer) {
		double quantitat = 0;
	    switch (lloguer.getVehicle().getCategoria()) {
	        case Vehicle.BASIC:
	            quantitat += 3;
	            if (lloguer.getDies() > 3) {
	                quantitat += (lloguer.getDies() - 3) * 1.5;
	            }
	            break;
	        case Vehicle.GENERAL:
	            quantitat += 4;
	            if (lloguer.getDies() > 2) {
	                quantitat += (lloguer.getDies() - 2) * 2.5;
	            }
	            break;
	        case Vehicle.LUXE:
	            quantitat += lloguer.getDies() * 6;
	            break;
	    }
	    return quantitat;
	}*/
    
}
