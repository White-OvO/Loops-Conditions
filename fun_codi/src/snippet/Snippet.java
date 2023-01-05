package snippet;

public class Snippet {
	function setup() {
		createCanvas(600,400);
	}
	
	function draw() {
		background(225);
		var x = framecount %100;
		system.out.print(x + " " + frameCount);
	}
}

