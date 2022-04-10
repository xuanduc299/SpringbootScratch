package com.SpringBootScratch.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Studentinformation_tb")
@Data
public class StudentInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String masv;
	private String trangthai;
	private String gender;
	private String ngayvao;
	private String Mahoso;
	private int khoadt;
	private String coso;
	private String bacdaotao;
	private String loaihinhdt;
	private String nganh;
	private String chuyennganh;
	private String khoa;
	private String lop;
	private String chucvu;
	private String congtacdoan;
	
	public StudentInformation() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNgayvao() {
		return ngayvao;
	}
	public void setNgayvao(String ngayvao) {
		this.ngayvao = ngayvao;
	}
	public String getMahoso() {
		return Mahoso;
	}
	public void setMahoso(String mahoso) {
		Mahoso = mahoso;
	}
	public int getKhoadt() {
		return khoadt;
	}
	public void setKhoadt(int khoadt) {
		this.khoadt = khoadt;
	}
	public String getCoso() {
		return coso;
	}
	public void setCoso(String coso) {
		this.coso = coso;
	}
	public String getBacdaotao() {
		return bacdaotao;
	}
	public void setBacdaotao(String bacdaotao) {
		this.bacdaotao = bacdaotao;
	}
	public String getLoaihinhdt() {
		return loaihinhdt;
	}
	public void setLoaihinhdt(String loaihinhdt) {
		this.loaihinhdt = loaihinhdt;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public String getChuyennganh() {
		return chuyennganh;
	}
	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public String getCongtacdoan() {
		return congtacdoan;
	}
	public void setCongtacdoan(String congtacdoan) {
		this.congtacdoan = congtacdoan;
	}
	
	
	
}
