package model;


public class Pikachu extends Pokemon{
	private String characteristics;
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
	public Pikachu(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp) {
		super(pokemonName, pokemonNumber);
		pokemonName="Pikachu";
		pokemonNumber=25;
		this.characteristics = "Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
		this.type ="ELECTRIC";
		this.evolution = "RAICHU";
		this.baseExp = "112";
	}
	
	
	
}