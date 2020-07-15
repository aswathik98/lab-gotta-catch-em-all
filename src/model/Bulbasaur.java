package model;



public class Bulbasaur extends Pokemon{
	
	private String characteristics ;
	private String type;
	private String evolution;
	private String baseExp;
	
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEvolution() {
		return evolution;
	}
	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	public String getBaseExp() {
		return baseExp;
	}
	public void setBaseExp(String baseExp) {
		this.baseExp = baseExp;
	}
	
	public Bulbasaur(String pokemonName,int pokemonNumber,String characteristics, String type,String evolution,String baseExp) {
		
		super(pokemonName, pokemonNumber);
		
					pokemonName = "Bulbasaur";
					pokemonNumber = 001;
					characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
					type = "POISON";
					evolution = "IVYSAUR";
					baseExp = "64" ;
		
		
	}
	
	
}


