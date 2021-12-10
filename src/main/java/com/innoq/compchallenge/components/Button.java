package com.innoq.compchallenge.components;

import java.util.Map;

import io.quarkus.qute.Mapper;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = "components_Button")
public class Button {
    public static final Map<String, String> CLASS_MAPPING = Map.of("cta", "btn-primary", "default", "btn-secondary");

    public static String getCssClassFor(String style) {
        return CLASS_MAPPING.getOrDefault(style != null ? style : "default", CLASS_MAPPING.get("default"));
    }
}
