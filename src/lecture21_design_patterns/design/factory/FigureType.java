package lecture21_design_patterns.design.factory;

public enum FigureType {
	TRIANGLE {
		public Figure createFigure() {
			return new Triangle();
		}
	},
	CIRCLE {
		public Figure createFigure() {
			return new Circle();
		}
	},
	SQUARE {
		public Figure createFigure() {
			return new Square();
		}
	};

	public abstract Figure createFigure();
}
