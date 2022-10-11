package com.accenture.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeroModel {

    @ValueMapValue
    private String subtitle;
    @ValueMapValue
    private String heading;
    @ValueMapValue
    private String description;

    public String getSubtitle() {
        return subtitle;
    }

    public String getHeading() { return heading; }

    public String getDescription() { return description; }
}