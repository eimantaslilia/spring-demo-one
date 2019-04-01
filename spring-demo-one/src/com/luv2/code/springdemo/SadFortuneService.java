package com.luv2.code.springdemo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class SadFortuneService implements FortuneService {
	ArrayList<String> fortunes = new ArrayList<String>();

	@Override
	public String getFortune() {
		fortunes.add("Ain't gon be such a good day today m8");
		fortunes.add("Hope ya'll have a mighty hard day amigo");
		fortunes.add("god bless u on this sad day gentleman");
		Random random = new Random();
		int n = random.nextInt(3);
		return fortunes.get(n);
	}

}
