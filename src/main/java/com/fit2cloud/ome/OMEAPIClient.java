package com.fit2cloud.ome;

import com.fit2cloud.ome.model.Baremetal;
import com.fit2cloud.ome.model.StorageDevice;

import java.util.List;

public class OMEAPIClient {
    private String endpoint;
    private String username;
    private String password;

    static final String STORAGE_ENPOINT = "";

    public OMEAPIClient(String endpoint, String username, String password) {
        this.endpoint = endpoint;
        this.username = username;
        this.password = password;
    }

    public List<Baremetal> getBaremetalList() {
        String url =  "";
        RestClient restClient = new RestClient(url);
        restClient.addBasicAuthentication("administ", "");
        r
        restClient.
        return null;
    }

    public List<StorageDevice> getStorageDeviceList() {

        return null;
    }


    public Baremetal getBaremetal(String baremetalId) {

        return null;
    }

}