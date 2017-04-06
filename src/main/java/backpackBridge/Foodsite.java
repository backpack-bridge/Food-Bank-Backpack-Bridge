package backpackBridge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Foodsite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@NotEmpty
	private String program_name;
	@NotEmpty
	private String site_coordinator_first_name;
	@NotEmpty
	private String site_coordinator_last_name;
	@NotEmpty
	private String phone_number;
	@NotEmpty
	@Email
	private String e_mail;
	@NotEmpty
	private String executive_director_first;
	@NotEmpty
	private String executive_director_last;
	@NotEmpty
	private String county_of_program;
	@NotEmpty
	private String school_district;
	@NotEmpty
	private String mid_ohio_primary_contact_first;
	@NotEmpty
	private String mid_ohio_primary_contact_last;
	@NotEmpty
	private String address;
	@NotEmpty
	private String active;
	@NotEmpty
	private String start_date;
	@NotEmpty
	private String calender_ID;
	@NotEmpty
	@Min(0)
	private String number_of_kids_served;
	@NotEmpty
	@Min(0)
	private String number_of_volunteers_enlisted;
	@NotEmpty
	private String site_with_allergies;
	@NotEmpty
	private String drop_off_area_description;
	@NotEmpty
	private String distribution_area_description;

	protected Foodsite() {
	}

	public Foodsite(String id, String program_name, String site_coordinator_first_name,
			String site_coordinator_last_name, String phone_number, String e_mail, String executive_director_first,
			String executive_director_last, String county_of_program, String school_district,
			String mid_ohio_primary_contact_first, String mid_ohio_primary_contact_last, String address, String active,
			String start_date, String calender_ID, String number_of_kids_served, String number_of_volunteers_enlisted,
			String site_with_allergies, String drop_off_area_description, String distribution_area_description) {
		this.id = id;

		this.program_name = program_name;
		this.site_coordinator_first_name = site_coordinator_first_name;
		this.site_coordinator_last_name = site_coordinator_last_name;
		this.phone_number = phone_number;
		this.e_mail = e_mail;
		this.executive_director_first = executive_director_first;
		this.executive_director_last = executive_director_last;
		this.county_of_program = county_of_program;
		this.school_district = school_district;
		this.mid_ohio_primary_contact_first = mid_ohio_primary_contact_first;
		this.mid_ohio_primary_contact_last = mid_ohio_primary_contact_last;
		this.address = address;
		this.active = active;
		this.start_date = start_date;
		this.calender_ID = calender_ID;
		this.number_of_kids_served = number_of_kids_served;
		this.number_of_volunteers_enlisted = number_of_volunteers_enlisted;
		this.site_with_allergies = site_with_allergies;
		this.drop_off_area_description = drop_off_area_description;
		this.distribution_area_description = distribution_area_description;

	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the program_name
	 */
	public String getProgram_name() {
		return program_name;
	}

	/**
	 * @param program_name
	 *            the program_name to set
	 */
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}

	/**
	 * @return the site_coordinator_first_name
	 */
	public String getSite_coordinator_first_name() {
		return site_coordinator_first_name;
	}

	/**
	 * @param site_coordinator_first_name
	 *            the site_coordinator_first_name to set
	 */
	public void setSite_coordinator_first_name(String site_coordinator_first_name) {
		this.site_coordinator_first_name = site_coordinator_first_name;
	}

	/**
	 * @return the site_coordinator_last_name
	 */
	public String getSite_coordinator_last_name() {
		return site_coordinator_last_name;
	}

	/**
	 * @param site_coordinator_last_name
	 *            the site_coordinator_last_name to set
	 */
	public void setSite_coordinator_last_name(String site_coordinator_last_name) {
		this.site_coordinator_last_name = site_coordinator_last_name;
	}

	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}

	/**
	 * @param phone_number
	 *            the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * @return the e_mail
	 */
	public String getE_mail() {
		return e_mail;
	}

	/**
	 * @param e_mail
	 *            the e_mail to set
	 */
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	/**
	 * @return the exexutive_director_first
	 */
	public String getExecutive_director_first() {
		return executive_director_first;
	}

	/**
	 * @param exexutive_director_first
	 *            the exexutive_director_first to set
	 */
	public void setExecutive_director_first(String exexutive_director_first) {
		this.executive_director_first = exexutive_director_first;
	}

	/**
	 * @return the exexutive_director_last
	 */
	public String getExecutive_director_last() {
		return executive_director_last;
	}

	/**
	 * @param exexutive_director_last
	 *            the exexutive_director_last to set
	 */
	public void setExexutive_director_last(String exexutive_director_last) {
		this.executive_director_last = exexutive_director_last;
	}

	/**
	 * @return the county_of_program
	 */
	public String getCounty_of_program() {
		return county_of_program;
	}

	/**
	 * @param county_of_program
	 *            the county_of_program to set
	 */
	public void setCounty_of_program(String county_of_program) {
		this.county_of_program = county_of_program;
	}

	/**
	 * @return the school_district
	 */
	public String getSchool_district() {
		return school_district;
	}

	/**
	 * @param school_district
	 *            the school_district to set
	 */
	public void setSchool_district(String school_district) {
		this.school_district = school_district;
	}

	/**
	 * @return the mid_ohio_primary_contact_first
	 */
	public String getMid_ohio_primary_contact_first() {
		return mid_ohio_primary_contact_first;
	}

	/**
	 * @param mid_ohio_primary_contact_first
	 *            the mid_ohio_primary_contact_first to set
	 */
	public void setMid_ohio_primary_contact_first(String mid_ohio_primary_contact_first) {
		this.mid_ohio_primary_contact_first = mid_ohio_primary_contact_first;
	}

	/**
	 * @return the mid_ohio_primary_contact_last
	 */
	public String getMid_ohio_primary_contact_last() {
		return mid_ohio_primary_contact_last;
	}

	/**
	 * @param mid_ohio_primary_contact_last
	 *            the mid_ohio_primary_contact_last to set
	 */
	public void setMid_ohio_primary_contact_last(String mid_ohio_primary_contact_last) {
		this.mid_ohio_primary_contact_last = mid_ohio_primary_contact_last;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}

	/**
	 * @return the start_date
	 */
	public String getStart_date() {
		return start_date;
	}

	/**
	 * @param start_date
	 *            the start_date to set
	 */
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	/**
	 * @return the calender_ID
	 */
	public String getCalender_ID() {
		return calender_ID;
	}

	/**
	 * @param calender_ID
	 *            the calender_ID to set
	 */
	public void setCalender_ID(String calender_ID) {
		this.calender_ID = calender_ID;
	}

	/**
	 * @return the number_of_kids_served
	 */
	public String getNumber_of_kids_served() {
		return number_of_kids_served;
	}

	/**
	 * @param number_of_kids_served
	 *            the number_of_kids_served to set
	 */
	public void setNumber_of_kids_served(String number_of_kids_served) {
		this.number_of_kids_served = number_of_kids_served;
	}

	/**
	 * @return the number_of_volunteers_enlisted
	 */
	public String getNumber_of_volunteers_enlisted() {
		return number_of_volunteers_enlisted;
	}

	/**
	 * @param number_of_volunteers_enlisted
	 *            the number_of_volunteers_enlisted to set
	 */
	public void setNumber_of_volunteers_enlisted(String number_of_volunteers_enlisted) {
		this.number_of_volunteers_enlisted = number_of_volunteers_enlisted;
	}

	/**
	 * @return the site_with_allergies
	 */
	public String getSite_with_allergies() {
		return site_with_allergies;
	}

	/**
	 * @param site_with_allergies
	 *            the site_with_allergies to set
	 */
	public void setSite_with_allergies(String site_with_allergies) {
		this.site_with_allergies = site_with_allergies;
	}

	/**
	 * @return the drop_off_area_description
	 */
	public String getDrop_off_area_description() {
		return drop_off_area_description;
	}

	/**
	 * @param drop_off_area_description
	 *            the drop_off_area_description to set
	 */
	public void setDrop_off_area_description(String drop_off_area_description) {
		this.drop_off_area_description = drop_off_area_description;
	}

	/**
	 * @return the distribution_area_description
	 */
	public String getDistribution_area_description() {
		return distribution_area_description;
	}

	/**
	 * @param distribution_area_description
	 *            the distribution_area_description to set
	 */
	public void setDistribution_area_description(String distribution_area_description) {
		this.distribution_area_description = distribution_area_description;
	}

}
