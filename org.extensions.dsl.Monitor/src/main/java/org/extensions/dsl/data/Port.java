
package org.extensions.dsl.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Port {

    @SerializedName("us")
    @Expose
    private Us us;

    public Us getUs() {
        return us;
    }

    public void setUs(Us us) {
        this.us = us;
    }

}
