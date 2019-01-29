package com.barath.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "TEST")
public class WorkSiteEntity {


	// Company name.

	@Column (name="emp", nullable=false, length=4, unique=true)
	private Integer companyId = null;

	// Work site ID.
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="codlug", nullable=false, insertable=false, unique=true, updatable=false)
	private Long id = null;

	// Full name.

	@Column (name="nombre", nullable=false, length=40)
	private String  fullName = null;

	// Short name.

	@Column (name="nomabre", nullable=false, length=15)
	private String  shortName = null;

	// Country code.

	@Column (name="pais", nullable=true, length=3)
	private String  countryCode = null;

	// Province code.

	@Column (name="pcia", nullable=true, length=3)
	private String  provinceCode = null;

	// Province zip code.

	@Column (name="codp", nullable=true, length=8)
	private String  zipCode = null;

	// Work site address.

	@Column (name="direc", nullable=false, length=40)
	private String  address = null;

	// Building site number.

	@Column (name="nroobra", nullable=true, length=9)
	private Integer buildingNumber = null;

	// Site's title

	@Column (name="titlug", nullable=true, length=4)
	private Integer siteTitle = null;

	// Status

	@Column (name="status", nullable=true, length=1)
	private Integer status = null;

	// Active

	@Column (name="activ", nullable=true, length=4)
	private Integer active = null;

	// Is done

	@Column (name="realiz", nullable=true, length=1)
	private Integer done = null;

	// Exoneration

	@Column (name="exoneracion", nullable=true, length=3)
	private Integer exoneration = null;

	// Address number

	@Column (name="domnro", nullable=true, length=2)
	private Integer addressNumber = null;

	// Office number

	@Column (name="domofi", nullable=true, length=4)
	private String  officeNumber = null;

	// Phone number (1)

	@Column (name="tel1", nullable=true, length=25)
	private String  phoneNumber = null;

	// Fax number

	@Column (name="fax", nullable=true, length=25)
	private String  fax = null;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(Integer buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public Integer getSiteTitle() {
		return siteTitle;
	}

	public void setSiteTitle(Integer siteTitle) {
		this.siteTitle = siteTitle;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Integer getDone() {
		return done;
	}

	public void setDone(Integer done) {
		this.done = done;
	}

	public Integer getExoneration() {
		return exoneration;
	}

	public void setExoneration(Integer exoneration) {
		this.exoneration = exoneration;
	}

	public Integer getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(Integer addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public WorkSiteEntity(Integer companyId,  String fullName, String shortName,  String countryCode, String provinceCode,  String zipCode,  String address,  Integer buildingNumber,  Integer siteTitle,  Integer status,  Integer active,  Integer done,  Integer exoneration, Integer addressNumber, String officeNumber,  String phoneNumber,  String fax) {
		this.companyId = companyId;
		this.fullName = fullName;
		this.shortName = shortName;
		this.countryCode = countryCode;
		this.provinceCode = provinceCode;
		this.zipCode = zipCode;
		this.address = address;
		this.buildingNumber = buildingNumber;
		this.siteTitle = siteTitle;
		this.status = status;
		this.active = active;
		this.done = done;
		this.exoneration = exoneration;
		this.addressNumber = addressNumber;
		this.officeNumber = officeNumber;
		this.phoneNumber = phoneNumber;
		this.fax = fax;
	}

	public WorkSiteEntity() {
	}

	@Override
	public String toString() {
		return "WorkSiteEntity{" +
				"companyId=" + companyId +
				", id=" + id +
				", fullName='" + fullName + '\'' +
				", shortName='" + shortName + '\'' +
				", countryCode='" + countryCode + '\'' +
				", provinceCode='" + provinceCode + '\'' +
				", zipCode='" + zipCode + '\'' +
				", address='" + address + '\'' +
				", buildingNumber=" + buildingNumber +
				", siteTitle=" + siteTitle +
				", status=" + status +
				", active=" + active +
				", done=" + done +
				", exoneration=" + exoneration +
				", addressNumber=" + addressNumber +
				", officeNumber='" + officeNumber + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", fax='" + fax + '\'' +
				'}';
	}
}
