package com.katana.api.common;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by juan on 12/11/16.
 */
public class RequestCallTest {

    private RequestCall requestCall;

    @Before
    public void setup() {
        this.requestCall = new RequestCall();
    }

    @Test
    public void getService() {
        // SETUP
        String service = "Service";
        this.requestCall.setService(service);

        // ACTION
        String serviceObtained = this.requestCall.getService();

        // EXPECTED
        Assert.assertEquals(service, serviceObtained);
    }

    @Test
    public void setService() {
        // SETUP
        String service = "Service";

        // ACTION
        this.requestCall.setService(service);

        // EXPECTED
        Assert.assertEquals(service, this.requestCall.getService());
    }

    @Test
    public void getVersion() {
        // SETUP
        String version = "Version";
        this.requestCall.setVersion(version);

        // ACTION
        String versionObtained = this.requestCall.getVersion();

        // EXPECTED
        Assert.assertEquals(version, versionObtained);
    }

    @Test
    public void setVersion() {
        // SETUP
        String version = "Version";

        // ACTION
        this.requestCall.setVersion(version);

        // EXPECTED
        Assert.assertEquals(version, this.requestCall.getVersion());
    }

    @Test
    public void getAction() {
        // SETUP
        String action = "Action";
        this.requestCall.setAction(action);

        // ACTION
        String actionObtained = this.requestCall.getAction();

        // EXPECTED
        Assert.assertEquals(action, actionObtained);
    }

    @Test
    public void setAction() {
        // SETUP
        String action = "Action";

        // ACTION
        this.requestCall.setAction(action);

        // EXPECTED
        Assert.assertEquals(action, this.requestCall.getAction());
    }

}