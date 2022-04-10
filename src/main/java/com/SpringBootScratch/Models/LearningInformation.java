package com.SpringBootScratch.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Learninginformation_tb")
public class LearningInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tongtctl;
	private String diemtbtl;
	private int svnamthu;
	private String tgiandtao;
	private String tgianhoctoithieu;
	private String tgianhoctoida;
	private String gvcn;
	private String covanhtap;
	private String nienkhoa;
	private int sdt;
	private int tongtcno;
	private int somonno;
	
	public LearningInformation() {}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTongtctl() {
		return tongtctl;
	}

	public void setTongtctl(String tongtctl) {
		this.tongtctl = tongtctl;
	}

	public String getDiemtbtl() {
		return diemtbtl;
	}

	public void setDiemtbtl(String diemtbtl) {
		this.diemtbtl = diemtbtl;
	}

	public int getSvnamthu() {
		return svnamthu;
	}

	public void setSvnamthu(int svnamthu) {
		this.svnamthu = svnamthu;
	}

	public String getTgiandtao() {
		return tgiandtao;
	}

	public void setTgiandtao(String tgiandtao) {
		this.tgiandtao = tgiandtao;
	}

	public String getTgianhoctoithieu() {
		return tgianhoctoithieu;
	}

	public void setTgianhoctoithieu(String tgianhoctoithieu) {
		this.tgianhoctoithieu = tgianhoctoithieu;
	}

	public String getTgianhoctoida() {
		return tgianhoctoida;
	}

	public void setTgianhoctoida(String tgianhoctoida) {
		this.tgianhoctoida = tgianhoctoida;
	}

	public String getGvcn() {
		return gvcn;
	}

	public void setGvcn(String gvcn) {
		this.gvcn = gvcn;
	}

	public String getCovanhtap() {
		return covanhtap;
	}

	public void setCovanhtap(String covanhtap) {
		this.covanhtap = covanhtap;
	}

	public String getNienkhoa() {
		return nienkhoa;
	}

	public void setNienkhoa(String nienkhoa) {
		this.nienkhoa = nienkhoa;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public int getTongtcno() {
		return tongtcno;
	}

	public void setTongtcno(int tongtcno) {
		this.tongtcno = tongtcno;
	}

	public int getSomonno() {
		return somonno;
	}

	public void setSomonno(int somonno) {
		this.somonno = somonno;
	}
	
	
}
