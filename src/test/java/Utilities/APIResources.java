package Utilities;
//enum is special class in java which has collection of constants or methods
//instead of "public class", for enum it will be "public enum"
public enum APIResources {
    //in enum, we don't practice traditional method declaration, instead only argument
    //But we need to separate them with "," and at the end ";"

    AddPlaceAPI("/maps/api/place/add/json"),
    getPlaceAPI("/maps/api/place/get/json"),
    deletePlaceAPI("/maps/api/place/delete/json");
    //creating a global variable resource in the class
    private String resource;

    APIResources(String resource)
    {
        //this refers to the current class variable
        //constructor will return the loaded value we asked for, them assign it to the current class variable
        this.resource=resource;
    }

    public String getResource()
    {
        return resource;
    }
}
