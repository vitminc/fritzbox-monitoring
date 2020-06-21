
package org.extensions.dsl.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Spectrum {

    @SerializedName("ports")
    @Expose
    private int ports;
    @SerializedName("port")
    @Expose
    private List<Port> port = null;

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public List<Port> getPort() {
        return port;
    }

    public void setPort(List<Port> port) {
        this.port = port;
    }

}
