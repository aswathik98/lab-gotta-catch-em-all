package model;



public class Pokemon{
	private String pokemonName;
	private int pokemonNumber;
	
	
	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public int getPokemonNumber() {
		return pokemonNumber;
	}
	public void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	
	public Pokemon(String pokemonName,int pokemonNumber) {
		this.pokemonName = pokemonName;
		this.pokemonNumber = pokemonNumber;
		
	}
	
}

