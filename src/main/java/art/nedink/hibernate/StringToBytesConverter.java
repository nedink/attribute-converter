package art.nedink.hibernate;

import org.springframework.util.Base64Utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.nio.charset.StandardCharsets;

@Converter
public class StringToBytesConverter implements AttributeConverter<String, byte[]> {

    @Override
    public byte[] convertToDatabaseColumn(String attribute) {
        return attribute.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public String convertToEntityAttribute(byte[] dbData) {
        return new String(dbData, StandardCharsets.UTF_8);
    }
}
