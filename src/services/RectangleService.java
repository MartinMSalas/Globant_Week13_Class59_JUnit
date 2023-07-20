package services;

import entities.Rectangle;

public class RectangleService {
    public double calculateArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public double calculatePerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }
}
