package ultimateFrisbee.Workout;

public class Workout {
	int paired;
	String workout;

	public Workout(String workout, int paired) {
		this.workout = workout;
		this.paired = paired;
	}
	
	public boolean isPaired(){
		if(paired < 1){
			return false;
		}else{
			return true;
		}
		
	}
	public String getWorkout(){
		return this.workout;
	}
	@Override
	public String toString(){
		return this.getWorkout();
	}
}
