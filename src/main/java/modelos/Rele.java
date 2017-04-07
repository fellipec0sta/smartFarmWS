package modelos;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="rele")
@XmlType(propOrder={"valor"})
public class Rele {
	private String valor;
	
    public Rele() {}

	public Rele(String valor) {
		this.valor = valor;
	}

	@XmlElement
    public String getValor() {return valor;}
    public void setValor(String valor) {this.valor = valor;}
}



	

