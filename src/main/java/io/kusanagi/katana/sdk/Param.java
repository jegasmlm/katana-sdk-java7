/*
 * Java 7 SDK for the KATANA(tm) Platform (http://katana.kusanagi.io)
 * Copyright (c) 2016-2017 KUSANAGI S.L. All rights reserved.
 *
 * Distributed under the MIT license
 *
 * For the full copyright and license information, please view the LICENSE
 *  file that was distributed with this source code
 *
 * @link      https://github.com/kusanagi/katana-sdk-java7
 * @license   http://www.opensource.org/licenses/mit-license.php MIT License
 * @copyright Copyright (c) 2016-2017 KUSANAGI S.L. (http://kusanagi.io)
 *
 */

package io.kusanagi.katana.sdk;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.kusanagi.katana.api.component.Key;

/**
 * Created by juan on 18/11/16.
 */
public class Param {

    /**
     * The name of the parameter
     */
    @JsonProperty(Key.PARAM_NAME)
    private String name;

    /**
     * The value of the variable, which MAY be converted from the configuration based on the given type value, or null
     * if the variable for the given name does not exist
     */
    @JsonProperty(Key.PARAM_VALUE)
    private Object value;

    /**
     * The data type of the variable, which MAY be "null", "boolean", "integer", "float", "string", "array", "object" or "binary"
     */
    @JsonProperty(Key.PARAM_TYPE)
    private String type;

    /**
     * Determines if the parameter was provided in the request
     */
    private boolean exists;

    public Param() {
        // Default constructor to make possible the serialization of this object.
        this.value = "";
        this.type = "string";
        this.exists = false;
    }

    public Param(String name, Object value, String type, boolean exists) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.exists = exists;
    }

    public Param(Param other) {
        this.name = other.name;
        this.value = other.value;
        this.type = other.type;
        this.exists = other.exists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    // SDK Methods

    /**
     * @return the name of the parameter.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the value of the parameter, cast to the native data type defined for the parameter. The data type SHOULD
     * be limited to the data types available.
     */
    public Object getValue() {
        return value;
    }

    /**
     * @return the data type of the parameter.
     */
    public String getType() {
        return type;
    }

    /**
     * determine if the parameter exists in the request.
     *
     * @return true if the parameter exists in the request.
     */
    public boolean exists() {
        return exists;
    }

    /**
     * @param name Parameter name
     * @return a new instance of the Param object, which MUST use the existing attributes of the current instance, but
     * MUST update the name of the parameter with the given value of the REQUIRED name argument.
     */
    public Param copyWithName(String name) {
        return new Param(name, value, type, exists);
    }

    /**
     * @param value Parameter value
     * @return a new instance of the Param object, which MUST use the existing attributes of the current instance, but
     * MUST update the value of the parameter with the given value of the REQUIRED value argument.
     */
    public Param copyWithValue(String value) {
        return new Param(name, value, type, exists);
    }

    /**
     * @param type Parameter type
     * @return a new instance of the Param object, which MUST use the existing attributes of the current instance, but
     * MUST update the data type of the parameter with the given value of the REQUIRED type argument.
     */
    public Param copyWithType(String type) {
        return new Param(name, value, type, exists);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Param param = (Param) o;

        if (exists != param.exists) {
            return false;
        }
        if (name != null ? !name.equals(param.name) : param.name != null) {
            return false;
        }
        if (value != null ? !value.equals(param.value) : param.value != null) {
            return false;
        }
        return type != null ? type.equals(param.type) : param.type == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (exists ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Param{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", type='" + type + '\'' +
                ", exists=" + exists +
                '}';
    }
}
