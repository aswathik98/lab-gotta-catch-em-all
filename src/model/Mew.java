package model;

public class Mew extends Pokemon{
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
	public Mew(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp) {
		super(pokemonName, pokemonNumber);
		pokemonName="Mew";
		pokemonNumber= 151;
		this.characteristics = "Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
		this.type = "PSYCHIC";
		this.evolution = "NONE";
		this.baseExp = "64";
	}
	
	
	
}