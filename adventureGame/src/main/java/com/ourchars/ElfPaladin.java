package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Paladin;
import com.parents.Elf;

public class ElfPaladin extends Elf implements Paladin{

	public ElfPaladin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElfPaladin(int health, int mana, String name, Weapon weapon) {
		super(health, mana, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 100);
	}

	@Override
	public void changeMana() {
		super.setMana(mana + 20);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.SWORD);
	}

	
	

}
