package org.angeatt.patternstructurels.adapter;

public class ShapeAdapter implements Shape{
  ExternalDrawingLibrary externalDrawingLibrary;
  @Override
  public void draw() {
    externalDrawingLibrary.renderShape();
  }
}
