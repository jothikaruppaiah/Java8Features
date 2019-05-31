package cdpack;

public class Cd implements Comparable<Cd>{

	private String movieName;
	private String actorName;
	
	public Cd(){}
	
	

	public Cd(String movieName, String actorName) {
		this.movieName = movieName;
		this.actorName = actorName;
	}



	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	@Override
	public String toString() {
		return "Cd [movieName=" + movieName + ", actorName=" + actorName + "]";
	}

	@Override
	public int compareTo(Cd cd) {
		// TODO Auto-generated method stub
		return cd.getMovieName().compareTo(this.getMovieName());
	}
	
}
