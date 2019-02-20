package com.csms.util;

import java.util.List;

import com.csms.bean.Player;
import com.csms.bean.Team;

public interface CSMSUtilImp {
List<Player> getPlayersList(Team t1);
String getDetailsOfPlayer(Player p);
}
