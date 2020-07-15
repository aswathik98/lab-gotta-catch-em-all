package model;



public class Charizard extends Pokemon{
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
	
	public Charizard(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp) {
		super(pokemonName, pokemonNumber);
		pokemonName = "Charizard";
		pokemonNumber = 006;
		this.characteristics =  "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		this.type ="FIRE" ;
		this.evolution = "CHARMELEON";
		this.baseExp = "240" ;
	}
	
	
}