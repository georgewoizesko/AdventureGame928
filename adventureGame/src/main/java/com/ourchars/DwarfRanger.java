package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Ranger;
import com.parents.Dwarf;

public class DwarfRanger extends Dwarf implements Ranger{

	public DwarfRanger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DwarfRanger(int health, int mana, String name, Weapon weapon) {
		super(health, mana, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 30);
	}

	@Override
	public void changeMana() {
		super.setMana(mana + 10);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.BOW);
	}

	
	
}
