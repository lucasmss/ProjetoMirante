package com.mirante.projeto.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CADASTRO_COLABORADOR")
public class Colaborador implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String ocupation;
	private String adress;
	private String workplace; 
	private String skills;
	private String email;
	private String emailSocial;
	private Integer telephone;
	private Integer landline;
	
	
	public long getCodigo() {
		return id;
	}
	public void setCodigo(long codigo) {
		this.id = codigo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOcupation() {
		return ocupation;
	}
	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public Integer getLandline() {
		return landline;
	}
	public void setLandline(Integer landline) {
		this.landline = landline;
	}
	public String getEmailSocial() {
		return emailSocial;
	}
	public void setEmailSocial(String emailSocial) {
		this.emailSocial = emailSocial;
	}

}
