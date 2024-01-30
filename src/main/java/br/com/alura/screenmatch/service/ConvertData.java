package br.com.alura.screenmatch.service;

public interface ConvertData {

   <T> T getJsonConverter(String json, Class<T> tClass);
}
