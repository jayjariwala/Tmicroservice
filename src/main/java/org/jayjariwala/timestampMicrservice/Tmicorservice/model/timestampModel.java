package org.jayjariwala.timestampMicrservice.Tmicorservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class timestampModel {

	String unix,natural;

	public String getUnix() {
		return unix;
	}

	public void setUnix(String unix) {
		this.unix = unix;
	}

	public String getNatural() {
		return natural;
	}

	public void setNatural(String natural) {
		this.natural = natural;
	}
	
}
