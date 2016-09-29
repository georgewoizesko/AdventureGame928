package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Thief;
import com.parents.Dwarf;

public class DwarfThief extends Dwarf implements Thief{

	public DwarfThief() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DwarfThief(int health, int mana, String name, Weapon weapon) {
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
