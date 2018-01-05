package com.iotek.ssm.entity;

public class Recruit {
	
	private int id;//��Ƹ��
	private Position position;//ְλ��
	private String location;//������ַ
	private String job_type;//Contract(��ͬ)Э�鷽ʽ
	private String job_description;//ְλ����
	private String qualifications;//ְλҪ��
	
	public Recruit() {
		super();
	}

	public Recruit(int id, Position position, String location, String job_type, String job_description,
			String qualifications) {
		super();
		this.id = id;
		this.position = position;
		this.location = location;
		this.job_type = job_type;
		this.job_description = job_description;
		this.qualifications = qualifications;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	public String getJob_description() {
		return job_description;
	}

	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public String toString() {
		return "Recruit [id=" + id + ", position=" + position + ", location=" + location + ", job_type=" + job_type
				+ ", job_description=" + job_description + ", qualifications=" + qualifications + "]";
	}
	
}
