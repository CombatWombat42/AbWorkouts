package ultimateFrisbee.Workout;

import android.os.CountDownTimer;

public class WorkoutCountDownTimer extends CountDownTimer {
	WorkoutActivity activityToChange;
	long countDownInterval;
	public WorkoutCountDownTimer(long millisInFuture, long countDownInterval, WorkoutActivity activityToChange) {
		super(millisInFuture, countDownInterval);
		this.countDownInterval = countDownInterval;
		this.activityToChange = activityToChange;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onFinish() {
		activityToChange.setWorkoutText("Finished", 0);
	}

	@Override
	public void onTick(long millisUntilFinished) {
		Workout currentWorkout;
		if(millisUntilFinished < this.countDownInterval*2){
			currentWorkout = activityToChange.getNewNonPairedWorkout();
		}else{
			currentWorkout = activityToChange.getNewWorkout();
		}
		
		activityToChange.setWorkoutText(currentWorkout.getWorkout(),millisUntilFinished);
	}

}
