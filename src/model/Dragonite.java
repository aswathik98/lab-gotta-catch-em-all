package model;



public class Dragonite extends Pokemon{
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
	public Dragonite(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp) {
		super(pokemonName, pokemonNumber);
		pokemonName=" Dragonite";
		pokemonNumber=149;
		this.characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
		this.type = "DRAGON";
		this.evolution = "DRATINI";
		this.baseExp = "270";
	}
	
	
	
	
	
	
}