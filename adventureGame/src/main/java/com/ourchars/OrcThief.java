package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Thief;
import com.parents.Orc;

public class OrcThief extends Orc implements Thief{

	public OrcThief() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrcThief(int health, int mana, String name, Weapon weapon) {
		super(health, mana, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub
		Thief.super.changeHealth();
	}

	@Override
	public void changeMana() {
		// TODO Auto-generated method stub
		Thief.super.changeMana();
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.DAGGER);
	}

	

}
