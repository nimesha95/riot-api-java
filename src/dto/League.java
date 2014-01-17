package dto;

import java.util.List;

public class League {

	private List<LeagueItem> entries;
	private String name, queue, tier;
	
	public List<LeagueItem> getEntries() {
		return entries;
	}

	public String getName() {
		return name;
	}
	
	public String getQueue() {
		return queue;
	}

	public String getTier() {
		return tier;
	}	
}