package br.com.alura.screenmatch.converters;

import br.com.alura.screenmatch.dto.SerieDTO;
import br.com.alura.screenmatch.service.ConvertData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToSerieDTOConverter implements ConvertData {

    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T getJsonConverter(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json, tClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
