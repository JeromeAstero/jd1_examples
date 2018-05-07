package lecture21_design_patterns.design.factory;

public class Main {
    public static void main(String[] args) {
        Figure figure = FigureFactory.getFigure(FigureType.TRIANGLE);
        figure.draw();

        Figure newFigure = FigureFactory.getFigure(FigureType.CIRCLE);
        newFigure.draw();
    }
}
