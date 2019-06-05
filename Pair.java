package HomeworkChapter20;

class Pair<F, S> {
	private F  first;
	private S second;
	
	public F getFirst() {
		return first;
	}
	public void setFirst(F first) {
		this.first = first;
	}
	public S getSecond() {
		return second;
	}
	public void setSecond(S second) {
		this.second = second;
	}
	
}



//20.8 (Generic Class Pair) Write a generic class Pair which has two type parameters—F and S—
//each representing the type of the first and second element of the pair, respectively. Add get and set
//methods for the first and second elements of the pair. [Hint: The class header should be public
//class Pair<F, S>.]