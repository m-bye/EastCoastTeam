package com.eastcoastteam.core.models;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ExtendedHeaderModel {

    @ValueMapValue
    private String title;
    @ValueMapValue
    private String description;
    @ValueMapValue
    private String linkOne;
    @ValueMapValue
    private String linkOnehRef;
    @ValueMapValue
    private String linkTwo;
    @ValueMapValue
    private String linkTwohRef;
    @ValueMapValue
    private String linkThree;
    @ValueMapValue
    private String linkThreehRef;
    @ValueMapValue
    private String linkFour;
    @ValueMapValue
    private String linkFourhRef;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLinkOne(){
        return linkOne;
    }

    public String getLinkOnehRef(){
        return linkOnehRef;
    }

    public String getLinkTwo(){
        return linkTwo;
    }

    public String getLinkTwohRef(){
        return linkTwohRef;
    }

    public String getLinkThree(){
        return linkThree;
    }

    public String getLinkThreehRef(){
        return linkThreehRef;
    }

    public String getLinkFour(){
        return linkFour;
    }

    public String getLinkFourhRef(){
        return linkFourhRef;
    }


}