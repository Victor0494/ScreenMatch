package br.com.alura.screenmatch;

import br.com.alura.screenmatch.converters.JsonToSerieDTOConverter;
import br.com.alura.screenmatch.dto.SerieDTO;
import br.com.alura.screenmatch.service.ConsumeAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var api = new ConsumeAPI();
		var json = api.obterDados("http://www.omdbapi.com/?t=friends&apikey=46a2d7f4");
		System.out.println(json);

		JsonToSerieDTOConverter dtoConverter = new JsonToSerieDTOConverter();

		SerieDTO dto = dtoConverter.getJsonConverter(json, SerieDTO.class);
		System.out.println(dto);
	}
}
