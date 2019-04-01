package Test;

import facade.FigureFacade;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FigureFacade figureF = new FigureFacade();
        //tracer un cercle 
        figureF.tracerCercle();
        //tracer un rectangle 
        figureF.tracerRectangle();
        //tracer un carre
        figureF.tracerCarre();
	}

}
