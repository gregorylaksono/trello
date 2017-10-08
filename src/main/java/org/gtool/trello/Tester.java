package org.gtool.trello;

import java.util.List;

import org.trello4j.Trello;
import org.trello4j.TrelloImpl;
import org.trello4j.model.Board;
import org.trello4j.model.Organization;


public class Tester {

	public static void main(String[] args) {
		String apiKey = "f1a8d788077e371afe7b0592cde53fef";
		String token = "cc994fc8ea3fc7dc4ada20e0889b6786466111912a723d04f85643c3bdb4858f";
		Trello t = new TrelloImpl(apiKey, token);
		
		List<Board> as = t.getBoardsByMember("gregorylaksono1");
		System.out.println(as);
	}

}
