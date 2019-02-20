package com.csms.bean;

import java.util.ArrayList;
import java.util.List;

public class Team {
String name;
int score;
List<Player> playersList = new ArrayList<Player>();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Player> getPlayersList() {
	return playersList;
}
public void setPlayersList(List<Player> playersList) {
	this.playersList = playersList;
}

}
