package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Warrior;
import com.parents.Orc;

public class OrcWarrior extends Orc implements Warrior{

	public OrcWarrior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrcWarrior(int health, int mana, String name, Weapon weapon) {
		super(health, mana, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 120);
	}

	@Override
	public void changeMana() {
		// TODO Auto-generated method stub
		super.setMana(mana + 0);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.MACE);
	}

	
	

}
