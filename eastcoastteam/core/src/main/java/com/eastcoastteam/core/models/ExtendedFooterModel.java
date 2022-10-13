package com.eastcoastteam.core.models;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ExtendedFooterModel {

    @ValueMapValue
    private String title;
    @ValueMapValue
    private String description;
    @ValueMapValue
    private List<String> links;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getLinks() {

        return links;
    }


}