package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Thief;
import com.parents.Human;

public class HumanThief extends Human implements Thief{

	public HumanThief() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HumanThief(int health, int mana, String name, Weapon weapon) {
		super(health, mana, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 20);
	}

	@Override
	public void changeMana() {
		super.setMana(mana + 20);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.DAGGER);
	}


	
	

}
