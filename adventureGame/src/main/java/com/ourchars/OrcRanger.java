package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Ranger;
import com.parents.Orc;

public class OrcRanger extends Orc implements Ranger{

	public OrcRanger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrcRanger(int health, int mana, String name, Weapon weapon) {
		super(health, mana, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub
		Ranger.super.changeHealth();
	}

	@Override
	public void changeMana() {
		// TODO Auto-generated method stub
		Ranger.super.changeMana();
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.BOW);
	}

	
	

}
