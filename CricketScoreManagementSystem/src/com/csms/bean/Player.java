package com.csms.bean;

import com.csms.TypeOfPlayer;

public class Player {

private String name;
private Team team;
private TypeOfPlayer type;
private int noOfBallsPlayed;
private int score;
private int noOf4;
private int noOf6;
private int noOfBallsDelivered;
private int remainingOvers;
private int noOfWicketsTaken;

public int getNoOfBallsPlayed() {
	return noOfBallsPlayed;
}

public void setNoOfBallsPlayed(int noOfBallsPlayed) {
	this.noOfBallsPlayed = noOfBallsPlayed;
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public int getNoOf4() {
	return noOf4;
}

public void setNoOf4(int noOf4) {
	this.noOf4 = noOf4;
}

public int getNoOf6() {
	return noOf6;
}

public void setNoOf6(int noOf6) {
	this.noOf6 = noOf6;
}

public int getNoOfBallsDelivered() {
	return noOfBallsDelivered;
}

public void setNoOfBallsDelivered(int noOfBallsDelivered) {
	this.noOfBallsDelivered = noOfBallsDelivered;
}

public int getRemainingOvers() {
	return remainingOvers;
}

public void setRemainingOvers(int remainingOvers) {
	this.remainingOvers = remainingOvers;
}

public int getNoOfWicketsTaken() {
	return noOfWicketsTaken;
}

public void setNoOfWicketsTaken(int noOfWicketsTaken) {
	this.noOfWicketsTaken = noOfWicketsTaken;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public Team getTeam() {
	return team;
}

public void setTeam(Team team) {
	this.team = team;
}

public TypeOfPlayer getType() {
	return type;
}

public void setType(TypeOfPlayer type) {
	this.type = type;
}

}
