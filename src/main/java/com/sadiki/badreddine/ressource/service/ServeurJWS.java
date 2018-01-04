package com.sadiki.badreddine.ressource.service;

import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8585/";
        Endpoint.publish(url, new EntrepriseSoapService());
        String url2 = "http://localhost:8586/";
        Endpoint.publish(url2, new RessourceSoapService());
    }
}
