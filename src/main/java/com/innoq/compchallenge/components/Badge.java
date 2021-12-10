package com.innoq.compchallenge.components;

import java.util.Map;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = "components_Badge")
public class Badge {
    public static final Map<String, String> CLASS_MAPPING = Map.of("danger", "bg-danger", "default", "bg-dark");

    public static String getCssClassFor(String type) {
        return CLASS_MAPPING.getOrDefault(type, CLASS_MAPPING.get("default"));
    }
}
