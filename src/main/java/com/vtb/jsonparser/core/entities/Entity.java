package com.vtb.jsonparser.core.entities;

import com.vtb.jsonparser.core.util.JsonConverter;
import com.vtb.jsonparser.core.util.XmlConverter;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface Entity {
    default void serializeToJson(String filename) {
        JsonConverter.toJSON(filename, this);
    }

    default void serializeToXml(String filename){
        XmlConverter.toXML(filename, this);
    }

    default Entity deserializeFromXml(String filename) throws JAXBException {
        return XmlConverter.toJavaObject(filename, this.getClass());
    }

    default Entity deserializeFromJson(String filename) throws IOException {
        return JsonConverter.toJavaObject(filename, this.getClass());
    }
}
