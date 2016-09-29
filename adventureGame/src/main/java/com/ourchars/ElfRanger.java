package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Ranger;
import com.parents.Elf;

public class ElfRanger extends Elf implements Ranger{

	public ElfRanger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElfRanger(int health, int mana, String name, Weapon weapon) {
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
