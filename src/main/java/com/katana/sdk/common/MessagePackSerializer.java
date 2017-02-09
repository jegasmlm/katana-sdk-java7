package com.katana.sdk.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;

import java.io.IOException;

/**
 * Created by juan on 25/09/16.
 */
public class MessagePackSerializer implements Serializer {

    private ObjectMapper objectMapper = new ObjectMapper(new MessagePackFactory());

    /**
     * @param message
     * @param aClass
     * @param <T>
     * @return
     */
    @Override
    public <T> T read(byte[] message, Class<T> aClass) {
        try {
            return objectMapper.readValue(message, aClass);
        } catch (IOException e) {
            Logger.log(Logger.ERROR, e);
            return null;
        }
    }

    /**
     * @param message
     * @return
     */
    @Override
    public byte[] write(Object message) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return objectMapper.writeValueAsBytes(message);
        } catch (Exception e) {
            Logger.log(Logger.ERROR, e);
            return new byte[0];
        }
    }

}
