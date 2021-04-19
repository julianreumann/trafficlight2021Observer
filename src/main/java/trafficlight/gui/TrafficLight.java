package trafficlight.gui;


import trafficlight.inter.Observer;
import trafficlight.states.State;

import java.awt.*;


public class TrafficLight extends Light implements Observer  {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void update(State s) {
        turnOn(!isOn());
    }
}
