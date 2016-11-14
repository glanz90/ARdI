package diceroll;


public abstract class DiceRollEvaluation {
	
	private EvaluationType type;
	private String evaluationString;
	
	public DiceRollEvaluation() {
		this.type = EvaluationType.DefaultRoll;
		evaluationString = "No Evaluation!";
	}
	
	public DiceRollEvaluation(EvaluationType type) {
		this.type = type;
	}

	public String getEvaluation() {
		return evaluationString;
	}
}
