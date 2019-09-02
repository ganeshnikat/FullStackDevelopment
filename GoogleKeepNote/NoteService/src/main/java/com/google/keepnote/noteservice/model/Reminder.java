package com.google.keepnote.noteservice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reminder {
	
	/*
	 * This class should have six fields
	 * (reminderId,reminderName,reminderDescription,reminderType,
	 * reminderCreatedBy,reminderCreationDate).  This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. The value of reminderCreationDate should not
	 * be accepted from the user but should be always initialized with the system
	 * date.
	 */
	@Id
	private String reminderId; 
	private String reminderName;
	private String reminderDescription;
	private String reminderType; 
	private String reminderCreatedBy;
	private Date reminderCreationDate;
	    public String getReminderId() {
	        return null;
	    }
		public String getReminderName() {
			return reminderName;
		}
		public void setReminderName(String reminderName) {
			this.reminderName = reminderName;
		}
		public String getReminderDescription() {
			return reminderDescription;
		}
		public void setReminderDescription(String reminderDescription) {
			this.reminderDescription = reminderDescription;
		}
		public String getReminderType() {
			return reminderType;
		}
		public void setReminderType(String reminderType) {
			this.reminderType = reminderType;
		}
		public String getReminderCreatedBy() {
			return reminderCreatedBy;
		}
		public void setReminderCreatedBy(String reminderCreatedBy) {
			this.reminderCreatedBy = reminderCreatedBy;
		}
		public Date getReminderCreationDate() {
			return reminderCreationDate;
		}
		public void setReminderCreationDate(Date reminderCreationDate) {
			this.reminderCreationDate = reminderCreationDate;
		}
		public void setReminderId(String reminderId) {
			this.reminderId = reminderId;
		}
		public Reminder(String reminderId, String reminderName, String reminderDescription, String reminderType,
				String reminderCreatedBy, Date reminderCreationDate) {
			super();
			this.reminderId = reminderId;
			this.reminderName = reminderName;
			this.reminderDescription = reminderDescription;
			this.reminderType = reminderType;
			this.reminderCreatedBy = reminderCreatedBy;
			this.reminderCreationDate = reminderCreationDate;
		}
		public Reminder() {
			
		}
	
	/*  public String getReminderId() {
	        return null;
	    }

	    public void setReminderId(String reminderId) {
	       
	    }

	    public String getReminderName() {
	        return null;
	    }

	    public void setReminderName(String reminderName) {
	       
	    }

	    public String getReminderDescription() {
	        return null;
	    }

	    public void setReminderDescription(String reminderDescription) {
	        
	    }

	    public String getReminderType() {
	        return null;
	    }

	    public void setReminderType(String reminderType) {
	       
	    }

	    public String getReminderCreatedBy() {
	        return null;
	    }

	    public void setReminderCreatedBy(String reminderCreatedBy) {
	        
	    }

	    public Date getReminderCreationDate() {
	        return null;
	    }

	    public void setReminderCreationDate(Date reminderCreationDate) {
	        
	    } */


}
