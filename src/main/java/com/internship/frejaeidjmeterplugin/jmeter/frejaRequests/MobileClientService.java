package com.internship.frejaeidjmeterplugin.jmeter.frejaRequests;

import com.verisec.frejaeid.commons.exception.FrejaEidException;
import com.verisec.frejaeid.commons.service.json.JsonServiceFactory;
import com.verisec.frejaeid.mobileclient.clients.api.MobileClientApi;
import com.verisec.frejaeid.mobileclient.clients.impl.MobileClient;
import com.verisec.frejaeid.service.commons.service.json.JsonService;

public class MobileClientService {

    private final MobileClientApi mobileClient;
    private static final String KEYSTORE_PATH = "src/main/resources/websocket_keystore.jks";
    private static final String KEYSTORE_PASSWORD = "123123123";
    private static final String SERVICE_ADRESS = "wss://frejaeidmobilesvc-st.test.frejaeid.com";

    static {
        JsonServiceFactory.registerJsonServiceProvider(new JsonService());
    }

    public MobileClientService() throws FrejaEidException, Exception {
        mobileClient = new MobileClient(SERVICE_ADRESS, KEYSTORE_PATH, KEYSTORE_PASSWORD);
    }
    
     static {
         JsonServiceFactory.registerJsonServiceProvider(new JsonService());
    }

    public void openSecureConnection() throws Exception {
        mobileClient.openSecureConnection();
    }

}