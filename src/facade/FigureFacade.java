package facade;

import dao.Carre;
import dao.Cercle;
import dao.Rectangle;

public class FigureFacade {
  private Carre carre;
  private Rectangle rectangle;
  private Cercle cercle;
  public FigureFacade()
  {
	  this.carre = new Carre();
	  this.cercle = new Cercle();
	  this.rectangle = new Rectangle();
	  }
  public void tracerCercle()
  {
	  cercle.tracer();
  }
  public void tracerRectangle()
  {
	  rectangle.tracer();
  }
  public void tracerCarre()
  {
	  carre.tracer();
  }
}
