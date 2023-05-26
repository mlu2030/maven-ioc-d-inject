package io.mlu.mde;

import org.springframework.stereotype.Component;

@Component
public class IoTDevice {
    String device;
    String description;

    public IoTDevice() {
        System.out.println("### Inside the constructor of IoTDevice()");
    }
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "IoTDevice {" +
                "device = '" + device + "!\'" +
                ", description = '" + description + "\'" + "}";
    }

    public void initBean() throws Exception {
        System.out.println("IoTDevice bean has been instantiated.  Inside the initBean() method.");
    }

    public void destroyBean() throws Exception {
        System.out.println("IoTDevice bean has been destroyed.  Inside the destroyBean() method.");
    }

}
