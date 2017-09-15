package com.anychart.anychart;

import java.util.Locale;

public enum LinearGaugePointerType implements JsObject.JsObjectInterface {
    BAR("bar"),
    LED("led"),
    MARKER("marker"),
    RANGE_BAR("rangeBar"),
    TANK("tank"),
    THERMOMETER("thermometer");

    private final String value;

    LinearGaugePointerType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}