import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.*;

/**
 * Helicopter for UMeR.
 */

public class Helicopter extends Vehicle {

    /** CONSTRUTORES */

    /**
     * Cria um Helicoptero sem parâmetros
     */
    public Helicopter() {
        this.setRegistration(null);
        this.setSpeed(110);
        this.setPrice(2.85);
        this.setReliable(0);
        this.setAvailable(true);
        this.setSeats(3);
        this.setPosition(new Point2D.Double(0, 0));
    }

    /**
     * Constroi um Helicoptero passado os parâmetros
     * @param registration Matrícula
     * @param reliable     Fator de fiabilidade
     * @param position     Posição atual
     */
    public Helicopter(String registration, double reliable, Point2D.Double position) {
        this.setRegistration(registration);
        this.setReliable(reliable);
        this.setAvailable(true);
        this.setPosition(new Point2D.Double(position.getX(), position.getY()));
        this.setSeats(3);
        this.setSpeed(110);
        this.setPrice(2.85);
    }

    /**
     * Constroi um Helicoptero a partir de um já existente
     * @param v
     */
    public Helicopter(Helicopter v) {
        this.setRegistration(v.getRegistration());
        this.setSpeed(v.getSpeed());
        this.setPrice(v.getPrice());
        this.setReliable(v.getReliable());
        this.setAvailable(v.isAvailable());
        this.setSeats(v.getSeats());
        this.setPosition(v.getPosition());
    }

    /**
     * Faz a cópia de um Helicoptero
     * @return Cópia de Helicoptero
     */
    public Helicopter clone(){
    	return new Helicopter(this);
    }
}
