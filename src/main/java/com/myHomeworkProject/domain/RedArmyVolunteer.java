package com.myHomeworkProject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RedArmyVolunteer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long militaryId;
    private String firstName;
    private String lastName; 
    private String farmlandToGoToState;
    private boolean goingToTheGulag;
    
    public RedArmyVolunteer() {
    	
    }
    public RedArmyVolunteer(String firstName, String lastName, String farmlandToGoToState) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.farmlandToGoToState = farmlandToGoToState;
    	this.goingToTheGulag = true;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFarmlandToGoToState() {
		return farmlandToGoToState;
	}

	public void setFarmlandToGoToState(String farmlandToGoToState) {
		this.farmlandToGoToState = farmlandToGoToState;
	}

	public boolean isGoingToTheGulag() {
		return goingToTheGulag;
	}
	public void setGoingToTheGulag(boolean goingToTheGulag) {
		this.goingToTheGulag = goingToTheGulag;
	}
	@Override
	public String toString() {
		return "RedArmyVolunteer [militaryId=" + militaryId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", farmlandToGoToState=" + farmlandToGoToState + "]";
	}
    
}
